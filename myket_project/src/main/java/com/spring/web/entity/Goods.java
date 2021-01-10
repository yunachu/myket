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
@Table(name = "goods")
@Getter
@Setter
public class Goods {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(nullable = false)
    private int code;
	
	@Column(length = 200, nullable = false)
    private String name;
	
    @Column(nullable = false)
    private int price;
    
    @ManyToOne
    @JoinColumn(name ="ctg_idx",nullable = false)
    private Category category;
    
    @Column(length = 1000, nullable = false)
    private String img;
    
	@Column(length = 4000, nullable = false)
    private String content;
    
	@Column(length = 50, nullable = false)
    private String regDate;
    
	@Column(length = 50, nullable = false)
    private String editDate;
    
	@Column(length = 10, nullable = false)
    private String status;
    
    @Column(nullable = false)
    private int stock;
    
    @Column(length = 1, nullable = false)
    private String isView;
    
    @Column(nullable = false)
    private int viewNum;
    
    @Column(nullable = false)
    private int supply;
    
	@Column(length = 50, nullable = false)
    private String produce;
    
	@Column(length = 50, nullable = false)
    private String origin;
    
    @Column(nullable = false)
    private int min;
    
    @Column(nullable = false)
    private int max;
    
    @Column(length = 10, nullable = false)
    private String dType;
    
    @Column(nullable = false)
    private int dPrice;
    
    @Column(nullable = false)
    private int dFreePrice;
    
    @Column(length = 10, nullable = false)
    private String dPay;
    
    @Column(nullable = false)
    private int dFixdPrice;
    
    @Column(nullable = false)
    private int sort;

	
    @ManyToOne
    @JoinColumn(name ="mem_idx",nullable = false)
    private Member member;

}
