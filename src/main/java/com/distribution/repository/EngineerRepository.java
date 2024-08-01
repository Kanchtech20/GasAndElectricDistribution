package com.distribution.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribution.dictionary.Skill;
import com.distribution.entity.Engineer;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer,Serializable> {

	public List<Engineer> findBySkills(List<Skill> skills);
	
}
