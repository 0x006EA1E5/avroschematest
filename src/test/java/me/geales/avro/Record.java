package me.geales.avro;

import com.jsoniter.annotation.JsonProperty;

import java.util.Map;

public class Record {

    @JsonProperty
    long ApproximateArrivalTimestamp;

    @JsonProperty(encoder = MapEnconder.class, decoder = ByteArrayToObjectDecoder.class)
    Map<String, Object> Data;
}
