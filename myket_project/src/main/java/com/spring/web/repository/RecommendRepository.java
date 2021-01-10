package com.spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.web.entity.Member;

@Repository
public interface RecommendRepository extends JpaRepository <Member, Long>{

}
