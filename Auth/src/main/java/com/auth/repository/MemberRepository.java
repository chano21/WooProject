package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.domain.Member;


public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findBymembername(String membername);

}