package com.example.practice2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.practice2.dto.BookDto;

@Mapper
public interface BookMapper {
    public BookDto selectBook(String book_no);

    public List<BookDto> selectBookList();

    public int deleteBook(String book_no);
}
