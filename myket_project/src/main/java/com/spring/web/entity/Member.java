package com.spring.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length = 20, nullable = false)
    private String memId;
	
	@Column(length = 200, nullable = false)
    private String pw;
	
	@Column(length = 20, nullable = false)
    private String name;
	
	@Column(length = 10, nullable = false)
    private String snsType;
	
	@Column(length = 4, nullable = false)
    private String bYear;
	
	@Column(length = 2, nullable = false)
    private String bMonth;
	
	@Column(length = 2, nullable = false)
    private String bDay;
	
	@Column(length = 4, nullable = false)
    private String phone1;
	
	@Column(length = 4, nullable = false)
    private String phone2;
	
	@Column(length = 4, nullable = false)
    private String phone3;
	
	@Column(length = 1, nullable = false)
    private String gender;
	
	@Column(length = 6, nullable = false)
    private String zipcode;
	
	@Column(length = 200, nullable = false)
    private String addr1;
	
	@Column(length = 200, nullable = false)
    private String addr2;
	
	@Column(length = 100, nullable = false)
    private String email;
	
	@Column(length = 50, nullable = false)
    private String regDate;
	
	@Column(length = 1, nullable = false)
    private String pushYN;
	
    @ManyToOne
    @JoinColumn(name ="grd_idx",nullable = false)
    private Grade grade;
	
	@Column(length = 50, nullable = false)
    private String lastLogin;
	
	@Column(length = 10, nullable = false)
    private String type;

}
