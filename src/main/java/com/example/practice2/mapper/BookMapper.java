package com.example.practice2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.practice2.dto.BookDto;

@Mapper
public interface BookMapper {
    BookDto selectBook(String book_no);

    List<BookDto> selectBookList();
}
