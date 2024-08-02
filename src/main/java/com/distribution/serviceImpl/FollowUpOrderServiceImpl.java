package com.distribution.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.distribution.entity.FollowUpOrder;
import com.distribution.service.FollowUpOrderService;

@Service
public class FollowUpOrderServiceImpl implements FollowUpOrderService {

	@Override
	public FollowUpOrder addOrder(FollowUpOrder workOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<FollowUpOrder> getFollowUpOrder(String callId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<FollowUpOrder> FollowUpOrderOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean voidFollowUpOrder(String callId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FollowUpOrder completeOrder(String callId) {
		// TODO Auto-generated method stub
		return null;
	}

}
