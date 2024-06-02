package com.yidong.ordering.controller;

import com.yidong.ordering.service.MemberService;
import com.yidong.ordering.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/queryMember")
    public List<Member> queryMember() {
        return memberService.queryMember();
    }
}
