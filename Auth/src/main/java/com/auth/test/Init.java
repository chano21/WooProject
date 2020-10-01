package com.auth.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.auth.domain.Member;
import com.auth.repository.MemberRepository;

@Component
public class Init implements ApplicationRunner {

	@Autowired
    private MemberRepository UserDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Member newUser = new Member();        
        PasswordEncoder passwordEncoder;
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        newUser.setMembername("taes");
        newUser.setPassword(passwordEncoder.encode("luke"));
        newUser.setMemberType(0);
        newUser.setDate(new Date()); 
        UserDao.save(newUser);
    }
}