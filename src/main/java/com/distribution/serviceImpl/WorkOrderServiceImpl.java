package com.distribution.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.distribution.exception.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribution.dictionary.Skill;
import com.distribution.dictionary.Status;
import com.distribution.dictionary.Statuses;
import com.distribution.entity.Engineer;
import com.distribution.entity.WorkOrder;
import com.distribution.repository.EngineerRepository;
import com.distribution.repository.WorkOrderRepository;
import com.distribution.service.WorkOrderService;

@Service
public class WorkOrderServiceImpl implements WorkOrderService {
	
	@Autowired
	WorkOrderRepository workOrderRepo;
	
	//@Autowired
	//Status status;
	
	
	Statuses status;
	
	@Autowired
	EngineerRepository engineerRepo;
	
	//Logger logger=LogManager.getLogger(WorkOrderService.class);

	/*
	 * Author:Kanchan Shelar Date : 
	 * Aug 1 2024 Discription: This function persists
	 * data in database table
	 */	
	
	@Override
	public WorkOrder addOrder(WorkOrder workOrder) {
		
          //if(workOrder.getCallId()!=null && workOrder.getStatus()== status.UNASSIGNED) {
			WorkOrder order=workOrderRepo.save(workOrder);
		//}
		return order;
	}

	@Override
	public Optional<WorkOrder> getWorkOrder(String callId) {
		Optional<WorkOrder> order = workOrderRepo.findById(callId);
		return order;
		
	}

	@Override
	public List<WorkOrder> getWorkOrders() {
		List<WorkOrder> orders = workOrderRepo.findAll();
		return orders;
	}

	@Override
	public boolean voidWorkOrder(String callId) {
        
        //logger.info("Getting order from database");		
		Optional<WorkOrder> order = workOrderRepo.findById(callId);
		Long orderId = order.get().getCallId();
		
		if(order.isPresent()) {
			workOrderRepo.deleteById(orderId);
			return true;
		}
		
		return false;
	}

	@Override
	public WorkOrder completeOrder(String callId) {
		
		//logger.info("Getting order from database");
		Optional<WorkOrder> order = workOrderRepo.findById(callId);
		WorkOrder workInformation = order.get();
		List<Skill> skillsRequired = workInformation.getSkillsRequired();
		   //List of Engineers who has exact same skills
		
		List<Engineer> engineers = engineerRepo.findBySkills(skillsRequired);
		//logger.info("Retured list of Enginners from database now need to check for empty");
		
		if(order.isPresent()) {
			if(engineers.isEmpty()) {
				throw new EnginnerWithSkillsNotFoundException("Enginner not found with required skills");
			}
			
			else {
			      for(Engineer eng:engineers) {
				      if(eng.getLatitute()<=workInformation.getLatitute() && eng.getLongitute()<=workInformation.getLongitute()) {
				    	  //logger.info("Enginner found with near location");
				    	  workInformation.setEnginner(eng);
				    	  workInformation.setStatus(status.COUMPLETE);
				    	  workInformation.setCompletedBy(eng.getName());
				    	  workInformation.setDateCompleted(LocalDateTime.now());
				    	  workOrderRepo.save(workInformation);
					   }
				
				}
			}
		}
		

		return null;
	}

	
}
