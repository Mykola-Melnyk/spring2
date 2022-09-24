package com.example.demo.reader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StubReader implements Reader {

    private final Iterator<String> iterator;

    public StubReader() {
        List<String> lines = new ArrayList<>();
        lines.add("1,one,один");
        lines.add("2,two,два");
        lines.add("3,three,три");
        iterator = lines.iterator();
    }
    @Override
    public String readLine() {
        return iterator.hasNext()
                ? iterator.next()
                : null;
    }
}
