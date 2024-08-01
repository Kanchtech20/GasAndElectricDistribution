package com.distribution.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribution.dictionary.Skill;
import com.distribution.entity.Engineer;
import com.distribution.entity.WorkOrder;

@Repository
public interface WorkOrderRepository extends JpaRepository<WorkOrder,Serializable> {

	public List<Engineer> findBySkills(List<Skill> skills);
}
