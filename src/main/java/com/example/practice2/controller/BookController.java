package com.example.practice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.practice2.dto.BookDto;
import com.example.practice2.service.BookService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class BookController {
    @Autowired
    BookService service;

    @GetMapping("/book/bookList")
    public void getMethodName(Model model) {
        List<BookDto> list = service.selectBookList();
        model.addAttribute("list", list);
        log.info("log : bookList");
    }
    
}
