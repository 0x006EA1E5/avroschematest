package me.geales.avro;

import com.jsoniter.JsonIterator;


import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ObjectIO {

    @Test
    public void testIO() {

        byte[] byteArray1 = new byte[123];
        byte[] byteArray2 = new byte[456];
        byte[] byteArray3 = new byte[789];

        try{
            FileOutputStream fos= new FileOutputStream("/tmp/myfile");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(byteArray1);
            oos.writeObject(byteArray2);
            oos.writeObject(byteArray3);

            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("/tmp/myfile");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.printf("available: %d\n",fis.available());
            while (fis.available() > 0) {
                Object o = ois.readObject();
                if (o instanceof byte[]) {
                    byte[] bytes = (byte[]) o;
                    System.out.printf("length: %d\n", bytes.length);
                }

            }
            ois.close();
            fis.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void jsonIter() {
//        JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH);
        JsonStream.setMode(EncodingMode.DYNAMIC_MODE);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("key1", "value");
        hashMap.put("key2", 4);
        String serialize = JsonStream.serialize(hashMap);
//        System.out.println(serialize);
        serialize.getBytes();

        Sample sample = new Sample();
//        sample.bytes = (serialize.getBytes());
        sample.field = ("value");
        sample.map = hashMap;
        String sampleJson = JsonStream.serialize(sample);

        System.out.println(sampleJson);

        try {
            Sample read = JsonIterator.parse(sampleJson).read(Sample.class);

            System.out.println(read.map);

//            Object parse = JsonIterator.parse(sampleJson).read();//.read(Sample.class);
//            System.out.println(parse.getBytes().length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRecords() throws IOException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("key1", "value");
        hashMap.put("key2", 4);

        Record record1 = new Record();
        record1.ApproximateArrivalTimestamp = 1;
        record1.Data = hashMap;

        Record record2 = new Record();
        record2.ApproximateArrivalTimestamp = 1;
        record2.Data = hashMap;

        RecordList recordList = new RecordList();

        ArrayList<Record> records = new ArrayList<>();
        records.add(record1);
        records.add(record2);
        recordList.records = records;

        String serialize = JsonStream.serialize(recordList);
        System.out.println(serialize);


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serialize.getBytes());
        RecordList recordList1 = JsonIterator.parse(byteArrayInputStream, 128).read(RecordList.class);

        System.out.println(recordList1.records);
    }
}
