package com.gop.myket.entity;

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
@Table(name = "cart")
@Getter
@Setter
public class Cart {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length = 50, nullable = false)
    private String regDate;
    @Column(nullable = false)
    private int count;
	
    @ManyToOne
    @JoinColumn(name ="mem_idx",nullable = false)
    private Member member;
    
    @ManyToOne
    @JoinColumn(name ="gds_idx",nullable = false)
    private Goods goods;
	
}
