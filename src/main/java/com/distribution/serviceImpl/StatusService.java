package com.distribution.serviceImpl;

import org.springframework.stereotype.Service;

import com.distribution.dictionary.Status;
import com.distribution.repository.StatusRepository;

@Service
public class StatusService {

	
	StatusRepository statusRepo;
	
	public Status addStatus(Status status) {
		Status newStatus = statusRepo.save(status);
		return newStatus;
	}
}
