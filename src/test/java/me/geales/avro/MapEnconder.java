package me.geales.avro;

import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.Encoder;

import java.io.IOException;
import java.io.OutputStream;

public class MapEnconder implements Encoder {

    @Override
    public void encode(Object obj, JsonStream stream) throws IOException {
        if(obj != null) {
            stream.writeArrayStart();
            JsonStream.serialize(obj, new OutputStream() {
                boolean start = true;
                @Override
                public void write(int b) throws IOException {
                    if (start) {
                        start = false;
                    } else {
                        stream.writeMore();
                    }
                    stream.writeVal(b);

                }
            });

            stream.writeArrayEnd();
//            stream.writeVal(JsonStream.serialize(obj).getBytes());
        }
        else {
            stream.writeEmptyArray();
        }

    }
}
