package me.geales.avro;

import org.apache.avro.generic.GenericData;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.*;

public class EmbeddedTest {

    @Test
    public void test() throws IOException {
        HeaderRecord headerRecord = new HeaderRecord("");
        Map<CharSequence, Object> rootMap = new HashMap<>();
        rootMap.put("key1", "val1");
        rootMap.put("key2", "val2");
        rootMap.put("key3", 1234);
        rootMap.put("key4", 567.8);
        Map<CharSequence, Object> subMap = new HashMap<>();
        subMap.put("key1", "val1");
        subMap.put("key2", "val2");
        subMap.put("key3", 1234);
        subMap.put("key4", 567.8f);
        rootMap.put("subMap", subMap);
        rootMap.put("list", Arrays.asList(1,2,3,4));

        Map<CharSequence, Object> subSubMap = new HashMap<>();
        subSubMap.put("subsubkey", "value");

//        subMap.put("embeddedMap", new EmbeddedMap(subSubMap));
        subMap.put("embeddedMap", subSubMap);
        Map nestedNestedMap = new HashMap<>();
//        subSubMap.put("nestedMap", new EmbeddedMap(nestedNestedMap));
        subSubMap.put("nestedMap", nestedNestedMap);

//        subMap.put("embeddedList", new EmbeddedList(Arrays.asList(5,6,7,8));
        subMap.put("embeddedList", Arrays.asList(5,6,7,8));

        String originalMap = rootMap.toString();
        Embedded embedded = replaceMaps(headerRecord, rootMap);

        ByteBuffer byteBuffer = embedded.toByteBuffer();

        Embedded deserialisedEmbedded = Embedded.fromByteBuffer(byteBuffer);

        Map<CharSequence, Object> outputMap = deserialisedEmbedded.getPayload();

        Assert.assertEquals(originalMap, replaceEmbeddedsInMap(outputMap).toString());
        replaceEmbeddedsInMap(outputMap);

//        myMap.forEach((charSequence, o) -> System.out.println(o.getClass()));
        System.out.println(outputMap);

    }

    private Embedded replaceMaps(HeaderRecord headerRecord, Map<CharSequence, Object> map) {
        boolean containsEmbeddedMap = false;
        boolean containsEmbeddedList = false;
        for (Map.Entry<CharSequence, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                Map<CharSequence, Object> innerMap = (Map<CharSequence, Object>) entry.getValue();
                for (Map.Entry innerEntry : innerMap.entrySet()) {
                    if (innerEntry.getValue() instanceof Map) {
                        innerMap.put((CharSequence) innerEntry.getKey(), replaceMapWithEmbbededMap((Map<CharSequence, Object>) innerEntry.getValue()) );
                        containsEmbeddedMap = true;
                    } else if (innerEntry.getValue() instanceof List) {
                        innerMap.put((CharSequence) innerEntry.getKey(), replaceListWithEmbbededList((List<Object>) innerEntry.getValue()) );
                        containsEmbeddedList = true;
                    }
                }
            } else if (entry.getValue() instanceof List) {
                List<Object> innerList = (List<Object>) entry.getValue();
                for (int i = 0; i < innerList.size(); i++) {
                    if (innerList.get(i) instanceof Map) {
                        innerList.set(i, replaceMapWithEmbbededMap((Map<CharSequence, Object>) innerList.get(i)));
                        containsEmbeddedMap = true;
                    } else if (innerList.get(i) instanceof List) {
                        innerList.set(i, replaceListWithEmbbededList((List<Object>) innerList.get(i)));
                        containsEmbeddedList = true;
                    }
                }
            }
        }
         return new Embedded(headerRecord, map, containsEmbeddedMap, containsEmbeddedList);
//        return new Embedded(headerRecord, map);
    }

    private EmbeddedMap replaceMapWithEmbbededMap(Map<CharSequence, Object> map) {
        boolean containsEmbeddedMap = false;
        boolean containsEmbeddedList = false;
        for (Map.Entry<CharSequence, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                map.put(entry.getKey(), replaceMapWithEmbbededMap((Map<CharSequence, Object>) entry.getValue()));
                containsEmbeddedMap = true;
            } else if (entry.getValue() instanceof List) {
                map.put(entry.getKey(), replaceListWithEmbbededList((List<Object>) entry.getValue()));
                containsEmbeddedList = true;
            }
        }
         return new EmbeddedMap(map, containsEmbeddedMap, containsEmbeddedList);
//        return new EmbeddedMap(map);
    }

    private EmbeddedList replaceListWithEmbbededList(List<Object> list) {
        boolean containsEmbeddedMap = false;
        boolean containsEmbeddedList = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Map) {
                list.set(i, replaceMapWithEmbbededMap((Map<CharSequence, Object>) list.get(i)));
                containsEmbeddedMap = true;
            } else if (list.get(i) instanceof List) {
                list.set(i, replaceListWithEmbbededList((List<Object>) list.get(i)));
                containsEmbeddedList = true;
            }
        }
         return new EmbeddedList(list, containsEmbeddedMap, containsEmbeddedList);
//        return new EmbeddedList(list);
    }

    private Map<CharSequence, Object> replaceEmbeddedsInMap(Map<CharSequence, Object> map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof EmbeddedMap) {
                EmbeddedMap embeddedMap = (EmbeddedMap) entry.getValue();
                if (embeddedMap.getContainsEmbeddedMap()) {
                    map.put((CharSequence) entry.getKey(), replaceEmbeddedsInMap(embeddedMap.getMap()));
                } else {
                    map.put((CharSequence) entry.getKey(), embeddedMap.getMap());
                }

            }
            else if (entry.getValue() instanceof Map) {
                Map m = (Map<CharSequence, Object>) entry.getValue();
                map.put((CharSequence) entry.getKey(), replaceEmbeddedsInMap(m));
            }
            else if (entry.getValue() instanceof EmbeddedList) {
                EmbeddedList a = (EmbeddedList) entry.getValue();
                if (a.getContainsEmbeddedList()) {
                    map.put((CharSequence) entry.getKey(), replaceEmbeddedsInList(a.getList()));
                } else {
                    map.put((CharSequence) entry.getKey(), a.getList());
                }
            }
            else if (entry.getValue() instanceof GenericData.Array) {
                List a = (GenericData.Array) entry.getValue();
                map.put((CharSequence) entry.getKey(), replaceEmbeddedsInList(a));
            }

        }
        return map;
    }

    private List<Object> replaceEmbeddedsInList(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);

            if (o instanceof EmbeddedMap) {
                EmbeddedMap e = (EmbeddedMap) o;
                if (e.getContainsEmbeddedMap()) {
                    list.set(i, replaceEmbeddedsInMap(e.getMap()));
                } else {
                    list.set(i, e.getMap());
                }
            }
            else if (o instanceof Map) {
                list.set(i, replaceEmbeddedsInMap((Map<CharSequence, Object>) o));
            }
            else if (o instanceof EmbeddedList) {
                EmbeddedList a = (EmbeddedList) o;
                if (a.getContainsEmbeddedList()) {
                    list.set(i, replaceEmbeddedsInList(a.getList()));
                } else {
                    list.set(i, a.getList());
                }

            }
            else if (o instanceof GenericData.Array) {
                List a = (GenericData.Array) o;
                list.set(i, replaceEmbeddedsInList(a));
            }

        }
        return list;
    }

}