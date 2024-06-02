package com.yidong.ordering.service.impl;

import com.yidong.ordering.dao.MemberDao;
import com.yidong.ordering.service.MemberService;
import com.yidong.ordering.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public List<Member> queryMember() {
        return memberDao.queryMember();
    }
}
