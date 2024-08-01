package com.distribution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.distribution.entity.WorkOrder;

@Service
public interface WorkOrderService {
	
	public WorkOrder addOrder(WorkOrder workOrder);
	public Optional<WorkOrder> getWorkOrder(String callId);
	public List<WorkOrder> getWorkOrders();
	public boolean voidWorkOrder(String callId);
	public WorkOrder completeOrder(String callId);

}
