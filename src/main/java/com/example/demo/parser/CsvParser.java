package com.example.demo.parser;

import com.example.demo.dto.NumberDto;
import org.springframework.stereotype.Component;

//@Component
public class CsvParser implements Parser{
    @Override
    public NumberDto parse(String line) {
        String[] parts = line.split(",");
        //TODO: Add validation
        return new NumberDto()
                .setNumber(parts[0])
                .setEnName(parts[1])
                .setUaName(parts[2]);
    }
}
