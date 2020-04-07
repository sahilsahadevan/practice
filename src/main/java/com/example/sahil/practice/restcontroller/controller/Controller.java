package com.example.sahil.practice.restcontroller.controller;

import com.example.sahil.practice.autowiring.service.SortServiceImpl;
import com.example.sahil.practice.restcontroller.pojo.Books;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/books")
    public List<Books> getBooks() {
        return Arrays.asList(
                new Books(1, "Deception Point", "Dan Brown"),
                new Books(2, "TinTin", "Herge"),
                new Books(3, "It", "Stephen King"));
    }


}
