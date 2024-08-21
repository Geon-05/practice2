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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@Slf4j
public class BookController {
    @Autowired
    BookService service;

    @GetMapping("/book/bookTables")
    public void bookList(Model model) {
        List<BookDto> list = service.selectBookList();
        model.addAttribute("list", list);
        log.info("log : bookList");
    }

    @GetMapping("/book/bookDetail")
    public void bookDetail(@RequestParam(required = false, name = "book_no") String no, Model model) {
        BookDto book = service.selectBook(no);
        model.addAttribute("book", book);
    }
    
    @GetMapping("/book/bookWrite")
    public void bookWrite() {
    }

    @PostMapping("/book/bookWriteAction")
    public String postMethodName() {
        
        return "";
    }
    
    
    @GetMapping("/book/bookDelete")
    public String bookDelete(@RequestParam(required = false, name = "book_no") String no, Model model) {
        if (no == null) {
            model.addAttribute("msg", "도서번호가 입력되지 않았습니다.");
            model.addAttribute("url", "/book/bookTables");
        }
        int delete = service.deleteBook(no);
        if (delete > 0) {
            model.addAttribute("msg", "삭제 되었습니다.");
            model.addAttribute("url", "/book/bookTables");
        } else {
            model.addAttribute("msg", "삭제 중 예외가 발생 하였습니다. \n 관리자에게 문의해주세요.");
        }
        return "/common/msg";
    }
    
}
