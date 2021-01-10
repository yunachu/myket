package com.spring.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;		
    	
	@Column(nullable = false)
    private int ref;
	
	@Column(nullable = false)
    private int sort;
	
	@Column(nullable = false)
    private int depth;
	
	@Column(length = 50, nullable = false)
    private String name;
	
	@Column(length = 1, nullable = false)
    private String isUse;
	
	@Column(length = 10, nullable = false)
    private String code;
	
	@Column(length = 100, nullable = false)
    private String codeFlow;

}
