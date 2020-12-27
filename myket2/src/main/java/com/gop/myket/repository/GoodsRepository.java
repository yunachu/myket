package com.gop.myket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gop.myket.entity.Goods;

@Repository
public interface GoodsRepository extends JpaRepository <Goods, Long>{

}
