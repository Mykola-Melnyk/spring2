package com.example.demo;

import com.example.demo.parser.CsvParser;
import com.example.demo.parser.Parser;
import com.example.demo.printer.ConsolePrinter;
import com.example.demo.printer.Printer;
import com.example.demo.reader.Reader;
import com.example.demo.reader.StubReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilePrinter implements CommandLineRunner {

	private CsvPrinter csvPrinter;

	public FilePrinter(CsvPrinter csvPrinter) {
		this.csvPrinter = csvPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(FilePrinter.class, args);
	}

	@Override
	public void run(String... args) {
		csvPrinter.start();
	}
}
