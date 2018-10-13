package me.geales.avro;

//import com.jsoniter.JsonIterator;

import com.jsoniter.JsonIterator;

import java.io.IOException;
import java.io.InputStream;

public class MyInputStream extends InputStream {

    private JsonIterator iter;

    public MyInputStream(JsonIterator iter) {
        this.iter = iter;
    }


    @Override
    public int read() throws IOException {
        boolean b = iter.readArray();
        if (b)
            return iter.readInt();
        return -1;

    }

}
