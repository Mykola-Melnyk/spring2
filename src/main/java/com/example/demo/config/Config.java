package com.example.demo.config;

import com.example.demo.parser.CsvParser;
import com.example.demo.parser.Parser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Parser parser() {
        return new CsvParser();
    }
}
