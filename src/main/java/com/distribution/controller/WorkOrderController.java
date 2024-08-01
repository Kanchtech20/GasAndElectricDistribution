package com.distribution.controller;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.distribution.Response.ApiResponse;
import com.distribution.entity.Engineer;
import com.distribution.entity.FollowUpOrder;
import com.distribution.entity.WorkOrder;
import com.distribution.service.EngineerService;
import com.distribution.service.FollowUpOrderService;
import com.distribution.service.WorkOrderService;

@RestController
@RequestMapping("/Orders")
public class WorkOrderController {

	@Autowired
	WorkOrderService orderService;
	
	@Autowired
	EngineerService engineerService;
	
	@Autowired
	FollowUpOrderService followupService;
	
	@PostMapping("/post/create")
	public ResponseEntity<ApiResponse> createOpration(@RequestBody (required =false) WorkOrder workOrder,
			                                          @RequestBody (required =false) Engineer engineer,
			                                          @RequestBody (required =false) FollowUpOrder follwUp){
		
		try {
			
		if(workOrder!=null) {
	        WorkOrder newOrder = orderService.addOrder(workOrder);	
	        return ResponseEntity.ok(new ApiResponse("order created:" +newOrder.getCallId(), HttpStatus.CREATED));
		}
		
		else if(engineer!=null) {
			Engineer newEngineer = engineerService.addEngineer(engineer);
			return ResponseEntity.ok(new ApiResponse("order created:" +newEngineer.getName(), HttpStatus.CREATED));

		}
		
		else if(follwUp!=null) {
			FollowUpOrder followup = followupService.addOrder(follwUp);
			return ResponseEntity.ok(new ApiResponse("order created:" +followup.getCallId()+"Main order" +followup.getParentOrder(), HttpStatus.CREATED));

		}
		
		else
		{
			return ResponseEntity.ok(new ApiResponse("invalid input please provide proper input",HttpStatus.BAD_REQUEST));
		}
			
		}catch(Exception  e) {
			return ResponseEntity.ok(new ApiResponse("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR));	
		}
		
		
	}
}
