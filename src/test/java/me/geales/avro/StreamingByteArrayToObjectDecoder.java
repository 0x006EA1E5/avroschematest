package me.geales.avro;

import com.jsoniter.JsonIterator;
import com.jsoniter.spi.Decoder;

import java.io.IOException;
import java.io.InputStream;

public class StreamingByteArrayToObjectDecoder implements Decoder {

    @Override
    public Object decode(JsonIterator iter) throws IOException {

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                boolean b = iter.readArray();
                if (b)
                    return iter.readInt();
                return -1;
            }
        };

        return JsonIterator.parse(new InputStream() {
                    @Override
                    public int read() throws IOException {
                        boolean b = iter.readArray();
                        if (b)
                            return iter.readInt();
                        return -1;
                    }
                },256)
            .read();
    }

}
