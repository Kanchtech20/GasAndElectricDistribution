package com.distribution.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribution.dictionary.TaskType;
import com.distribution.entity.Engineer;

@Repository
public interface TaskTypesRepository extends JpaRepository<TaskType,Serializable> {

	
}
