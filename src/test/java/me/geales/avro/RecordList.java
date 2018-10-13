package me.geales.avro;

import com.jsoniter.annotation.JsonProperty;

import java.util.List;

public class RecordList {

    @JsonProperty("MillisBehindLatest")
    long millisBehindLatest;

    @JsonProperty("NextShardIterator")
    String nextShardIterator;

    @JsonProperty("Records")
    List<Record> records;


}
