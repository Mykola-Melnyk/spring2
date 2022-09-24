package com.example.demo;

import com.example.demo.dto.NumberDto;
import com.example.demo.parser.CsvParser;
import com.example.demo.parser.Parser;
import com.example.demo.printer.ConsolePrinter;
import com.example.demo.printer.Printer;
import com.example.demo.reader.Reader;
import org.springframework.stereotype.Component;

@Component
public class CsvPrinter {
    private final Reader reader;
    private final Parser parser;
    private final Printer printer;

    public CsvPrinter(Reader reader, Parser parser, Printer printer) {
        this.reader = reader;
        this.parser = parser;
        this.printer = printer;
    }

    public void start() {
        String line;
        while ((line = reader.readLine()) != null) {
            NumberDto dto = parser.parse(line);
            printer.print(dto);
        }
    }
}
