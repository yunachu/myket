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
@Table(name = "grade")
@Getter
@Setter
public class Grade {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(length = 20, nullable = false)
    private String code;
	
	@Column(length = 20, nullable = false)
    private String name;
	
    @ManyToOne
    @JoinColumn(name ="mem_type",nullable = false)
    private Member member;

}
