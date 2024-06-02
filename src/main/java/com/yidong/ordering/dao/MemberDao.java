package com.yidong.ordering.dao;

import com.yidong.ordering.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberDao {

    List<Member> queryMember();
}
