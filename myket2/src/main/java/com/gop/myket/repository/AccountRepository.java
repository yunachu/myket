package com.gop.myket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gop.myket.entity.Member;

@Repository
public interface AccountRepository extends JpaRepository <Member, Long>{

}
