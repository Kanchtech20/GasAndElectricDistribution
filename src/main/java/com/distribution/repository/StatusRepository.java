package com.distribution.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribution.dictionary.Status;
import com.distribution.entity.Engineer;

@Repository
public interface StatusRepository extends JpaRepository<Status,Serializable> {

	
}
