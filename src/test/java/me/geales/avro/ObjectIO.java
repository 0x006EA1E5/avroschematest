package me.geales.avro;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

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
}
