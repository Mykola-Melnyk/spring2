package com.example.demo.parser;

import com.example.demo.dto.NumberDto;

public interface Parser {
    NumberDto parse(String line);
}
