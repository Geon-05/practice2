package com.example.practice2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice2.dto.BookDto;
import com.example.practice2.mapper.BookMapper;

@Service
public class BookService {
    @Autowired
    BookMapper mapper;

    public BookDto selectBook(String book_no){
        return mapper.selectBook(book_no);
    }

    public List<BookDto> selectBookList(){
        return mapper.selectBookList();
    }

    public int deleteBook(String book_no){
        return mapper.deleteBook(book_no);
    }
}
