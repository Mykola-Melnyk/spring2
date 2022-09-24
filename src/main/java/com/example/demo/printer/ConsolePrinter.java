package com.example.demo.printer;

import com.example.demo.dto.NumberDto;
import org.springframework.stereotype.Component;

@Component
public class ConsolePrinter implements Printer {

    @Override
    public void print(NumberDto dto) {
        System.out.printf("%s -> %s | %s\n", dto.getNumber(), dto.getEnName(), dto.getUaName());
    }
}
