package com.distribution.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribution.entity.Engineer;
import com.distribution.entity.FollowUpOrder;

@Repository
public interface FollowUpRepository extends JpaRepository<FollowUpOrder,Serializable> {

	
}
