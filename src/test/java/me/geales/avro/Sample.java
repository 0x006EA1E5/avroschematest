package me.geales.avro;

import com.jsoniter.annotation.JsonProperty;

import java.util.Map;

//    public class SampleOut {
//        public SampleOut() {
//
//        }
//        private String field;
//
//        private Map bytes;
//
//        public String getField() {
//            return field;
//        }
//
//        public void setField(String field) {
//            this.field = field;
//        }
//
//
//        public Map getBytes() {
//            return bytes;
//        }
//
//        public void setBytes(Map bytes) {
//            this.bytes = bytes;
//        }
//    }
public class Sample {



    @JsonProperty
        public String field;
    @JsonProperty
        public byte[] bytes;

    @JsonProperty(encoder = MapEnconder.class, decoder = ByteArrayToObjectDecoder.class)
    public Map map;

}
