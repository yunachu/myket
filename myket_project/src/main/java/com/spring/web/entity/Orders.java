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
@Table(name = "orders")
@Getter
@Setter
public class Orders {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	
	
    @ManyToOne
    @JoinColumn(name ="gds_idx",nullable = false)
    private Goods goods;
    
    @ManyToOne
    @JoinColumn(name ="mem_idx",nullable = false)
    private Member member;
    
	
	@Column(length = 50, nullable = false)
    private String date;

}
