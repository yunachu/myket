package com.gop.myket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gop.myket.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository <Orders, Long>{

}
