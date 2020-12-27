package com.gop.myket.entity;

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
@Table(name = "orderGoods")
@Getter
@Setter
public class OrderGoods {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	
	
    @ManyToOne
    @JoinColumn(name ="ord_idx",nullable = false)
    private Orders orders;
    
    @ManyToOne
    @JoinColumn(name ="gds_idx",nullable = false)
    private Goods goods;

}
