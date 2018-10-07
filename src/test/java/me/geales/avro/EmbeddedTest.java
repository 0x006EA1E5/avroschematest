package me.geales.avro;

import org.apache.avro.generic.GenericData;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.*;

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
        EmbeddedMap embeddedMap = new EmbeddedMap(subSubMap);
        subMap.put("embeddedMap", embeddedMap);
        Map nestedNestedMap = new HashMap<>();
        subSubMap.put("nestedMap", new EmbeddedMap(nestedNestedMap));
        EmbeddedList embeddedList = new EmbeddedList(Arrays.asList(5,6,7,8));
        subMap.put("embeddedList", embeddedList);
        Embedded embedded = new Embedded(headerRecord, objectObjectHashMap);

        ByteBuffer byteBuffer = embedded.toByteBuffer();

        Embedded deserialisedEmbedded = Embedded.fromByteBuffer(byteBuffer);

        Map<CharSequence, Object> outputMap = deserialisedEmbedded.getPayload();
        replaceEmbeddedMaps(outputMap);
//        myMap.forEach((charSequence, o) -> System.out.println(o.getClass()));
        System.out.println(outputMap);

    }

    private Map<CharSequence, Object>  replaceEmbeddedMaps(Map<CharSequence, Object> map) {
        for (Map.Entry o : map.entrySet()) {
            if (o.getValue() instanceof EmbeddedMap) {
                map.put((CharSequence) o.getKey(), replaceEmbeddedMaps(((EmbeddedMap) o.getValue()).getMap()));
            }
            else if (o.getValue() instanceof Map) {
                Map m = (Map<CharSequence, Object>) o.getValue();
                map.put((CharSequence) o.getKey(), replaceEmbeddedMaps(m));
            }
            else if (o.getValue() instanceof EmbeddedList) {
                EmbeddedList a = (EmbeddedList) o.getValue();
                map.put((CharSequence) o.getKey(), replaceEmbeddedLists(a.getList()));
            }
            else if (o.getValue() instanceof GenericData.Array) {
                List a = (GenericData.Array) o.getValue();
                map.put((CharSequence) o.getKey(), replaceEmbeddedLists(a));
            }

        }
        return map;
    }

    private List<Object>  replaceEmbeddedLists(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);

            if (o instanceof EmbeddedMap) {

                list.set(i, replaceEmbeddedMaps(((EmbeddedMap) o).getMap()));
            }
            else if (o instanceof Map) {
                list.set(i, replaceEmbeddedMaps((Map<CharSequence, Object>) o));
            }
            else if (o instanceof EmbeddedList) {
                EmbeddedList a = (EmbeddedList) o;
                list.set(i, replaceEmbeddedLists(a.getList()));
            }
            else if (o instanceof GenericData.Array) {
                List a = (GenericData.Array) o;
                list.set(i, replaceEmbeddedLists(a));
            }

        }
        return list;
    }

}