package me.geales.avro;

import com.jsoniter.JsonIterator;
import com.jsoniter.ValueType;
import com.jsoniter.spi.Decoder;

import java.io.*;

public class ByteArrayToObjectDecoder implements Decoder {



//    ObjectPool
//    private byte[] bytes = new byte[4096];
    private ThreadLocal<byte[]> threadLocalByteArray = ThreadLocal.withInitial(() -> new byte[4096]);
    @Override
    public Object decode(JsonIterator iter) throws IOException {



        if(iter.whatIsNext() == ValueType.ARRAY) {
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            byte[] bytes = threadLocalByteArray.get();
            int i = 0;
            for ( ; iter.readArray(); i++) {
                bytes[i] = (byte) iter.readInt();
//                byteArrayOutputStream.write(iter.readInt());
            }
//            bytes[i+1] = '\0';
//            byte[] bytes = byteArrayOutputStream.toByteArray();
            return JsonIterator.parse(bytes).read();
        }

        return null;
    }

}
