package com.example.MyShop.member.repository;

import com.example.MyShop.member.entity.Member;

import java.util.List;

public interface MemberRepository { ;

    Member findById(Long id);

    List<Member> findAll();
    Member findByLoginId(String loginId);
    void save(Member member);
    void deleteById(Long id);
}
