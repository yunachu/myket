package com.spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.web.entity.Goods;

@Repository
public interface GoodsRepository extends JpaRepository <Goods, Long>{

}
