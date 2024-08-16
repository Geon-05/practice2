package com.example.practice2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.practice2.dto.MemberDto;

@Mapper
public interface MemberMapper {
    MemberDto selectMember(String mem_no);

    List<MemberDto> selectMemberList();
}
