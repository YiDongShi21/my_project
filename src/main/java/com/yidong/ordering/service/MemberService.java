package com.yidong.ordering.service;

import com.yidong.ordering.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {

    List<Member> queryMember();
}
