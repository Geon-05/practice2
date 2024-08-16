package com.example.practice2.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.practice2.dto.MemberDto;

@SpringBootTest
public class MemberMapperTest {
    @Autowired
    MemberMapper mapper;

    @Test
    void testSelectMember() {
        MemberDto member = mapper.selectMember("M00001");
        assertNotNull(member);
    }

    @Test
    void testSelectMemberList() {
        List<MemberDto> list = mapper.selectMemberList();
        assertNotNull(list);
    }
}
