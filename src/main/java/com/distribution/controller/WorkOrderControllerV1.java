package com.distribution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.distribution.Response.ApiResponse;
import com.distribution.entity.Engineer;
import com.distribution.entity.FollowUpOrder;
import com.distribution.entity.WorkOrder;
import com.distribution.service.EngineerService;
import com.distribution.service.FollowUpOrderService;
import com.distribution.service.WorkOrderService;

@RestController
public class WorkOrderControllerV1 {

	@Autowired
	WorkOrderService orderService;
	
	
	@PostMapping("/post/create")
	public ResponseEntity<ApiResponse> createOpration(@RequestBody (required =false) WorkOrder workOrder
			                                          ){
		
	        WorkOrder newOrder = orderService.addOrder(workOrder);	
	        return ResponseEntity.ok(new ApiResponse("order created:" +newOrder.getCallId(), HttpStatus.CREATED));
		}
		
}
