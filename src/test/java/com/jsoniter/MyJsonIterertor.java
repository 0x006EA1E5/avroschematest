package com.jsoniter;

import com.jsoniter.spi.JsonException;

import java.io.InputStream;

public class MyJsonIterertor extends JsonIterator {

    private MyJsonIterertor(InputStream in, byte[] buf, int head, int tail) {
        this.in = in;
        this.buf = buf;
        this.head = head;
        this.tail = tail;
    }

    public static MyJsonIterertor parse(InputStream in, int bufSize) {
        try {

            enableStreamingSupport();
        } catch (JsonException e) {

        }
    return new MyJsonIterertor(in, new byte[bufSize], 0, 0);
    }
}
