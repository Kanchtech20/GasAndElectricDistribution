package com.distribution.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.distribution.entity.Engineer;
import com.distribution.service.EngineerService;

@Service
public class EngineerServiceImpl implements EngineerService {

	@Override
	public Engineer addEngineer(Engineer engineer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Engineer> getEngineer(String callId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Engineer> getEngineer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEngineer(String callId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Engineer completeOrder(String callId) {
		// TODO Auto-generated method stub
		return null;
	}

}
