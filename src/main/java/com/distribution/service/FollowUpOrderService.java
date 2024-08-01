package com.distribution.service;

import java.util.List;
import java.util.Optional;
import com.distribution.entity.*;

import org.springframework.stereotype.Service;


@Service
public interface FollowUpOrderService {
	
	public FollowUpOrder addOrder(FollowUpOrder workOrder);
	public Optional<FollowUpOrder> getFollowUpOrder(String callId);
	public List<FollowUpOrder> FollowUpOrderOrders();
	public boolean voidFollowUpOrder(String callId);
	public FollowUpOrder completeOrder(String callId);

}
