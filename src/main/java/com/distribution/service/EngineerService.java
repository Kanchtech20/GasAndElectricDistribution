package com.distribution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.distribution.entity.Engineer;


@Service
public interface EngineerService {
	
	public  Engineer addEngineer(Engineer  engineer);
	public Optional< Engineer> getEngineer(String callId);
	public List<Engineer> getEngineer();
	public boolean deleteEngineer(String callId);
	public  Engineer completeOrder(String callId);

}
