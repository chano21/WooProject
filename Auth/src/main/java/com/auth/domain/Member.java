package com.auth.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="t_member")
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "member_name", length = 20, unique = true, nullable = false)
    private String membername;
    @Column(length = 400, nullable = false)
    private String password;
    @Column(name = "member_type", nullable = false)
    private int memberType;
    @Column(nullable = false)
    private Date date;
}