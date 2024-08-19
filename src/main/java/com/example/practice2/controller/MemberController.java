package com.example.practice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.practice2.dto.MemberDto;
import com.example.practice2.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MemberController {
    @Autowired
    MemberService service;

    @GetMapping("/member/memberList")
    public void getMethodName(Model model) {
        List<MemberDto> list = service.selectMemberList();
        model.addAttribute("list", list);
    }

    @GetMapping("/member/memberDetail")
    public void getMethodName(@RequestParam(required = false, name = "mem_no") String no, Model model) {
        MemberDto member = service.selectMember(no);
        model.addAttribute("member", member);
    }
    
    
}
