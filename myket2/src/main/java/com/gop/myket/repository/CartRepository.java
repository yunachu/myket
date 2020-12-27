package com.gop.myket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gop.myket.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository <Cart, Long>{

}
