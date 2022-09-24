package com.example.demo;

import com.example.demo.parser.CsvParser;
import com.example.demo.parser.Parser;
import com.example.demo.printer.ConsolePrinter;
import com.example.demo.printer.Printer;
import com.example.demo.reader.Reader;
import com.example.demo.reader.StubReader;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class FilePrinter {

	public static void main(String[] args) {
//		SpringApplication.run(FilePrinter.class, args);
		Reader reader = new StubReader();
		Parser parser = new CsvParser();
		Printer printer = new ConsolePrinter();
		CsvPrinter csvPrinter = new CsvPrinter(reader, parser, printer);
		csvPrinter.start();
	}

}
