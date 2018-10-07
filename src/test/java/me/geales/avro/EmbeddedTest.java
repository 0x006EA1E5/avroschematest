package me.geales.avro;

import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmbeddedTest {

    @Test
    public void test() throws IOException {
        HeaderRecord headerRecord = new HeaderRecord("");
        Map<CharSequence, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("key1", "val1");
        objectObjectHashMap.put("key2", "val2");
        objectObjectHashMap.put("key3", 1234);
        objectObjectHashMap.put("key4", 567.8);
        Map<CharSequence, Object> subMap = new HashMap<>();
        subMap.put("key1", "val1");
        subMap.put("key2", "val2");
        subMap.put("key3", 1234);
        subMap.put("key4", 567.8f);
        objectObjectHashMap.put("subMap", subMap);
        objectObjectHashMap.put("list", Arrays.asList(1,2,3,4));

        Map<CharSequence, Object> subSubMap = new HashMap<>();
        subSubMap.put("subsubkey", "value");
        EmbeddedMap2 embeddedMap = new EmbeddedMap2(subSubMap);
        subMap.put("embeddedMap", embeddedMap);
        EmbeddedList2 embeddedList = new EmbeddedList2(Arrays.asList(5,6,7,8));
//        subMap.put("embeddedList", embeddedList);
        Embedded embedded = new Embedded(headerRecord, objectObjectHashMap);

        ByteBuffer byteBuffer = embedded.toByteBuffer();

        Embedded deserialisedEmbedded = Embedded.fromByteBuffer(byteBuffer);

        Map<CharSequence, Object> outputMap = deserialisedEmbedded.getPayload();
//        myMap.forEach((charSequence, o) -> System.out.println(o.getClass()));
        System.out.println(outputMap);

    }

}