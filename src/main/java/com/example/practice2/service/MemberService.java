package com.example.practice2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice2.dto.MemberDto;
import com.example.practice2.mapper.MemberMapper;

@Service
public class MemberService {
    @Autowired
    MemberMapper mapper;

    public MemberDto selectMember(String mem_no){
        return mapper.selectMember(mem_no);
    }

    public List<MemberDto> selectMemberList(){
        return mapper.selectMemberList();
    }
}
