package com.distribution.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.distribution.dictionary.Status;
import com.distribution.dictionary.TaskType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FollowUpOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String callId;
	private int WoNumber;

	@ManyToOne
	private WorkOrder parentOrder;
	@OneToOne
	private TaskType taskType;
	
	@OneToOne
	private Status status;
	@CreationTimestamp
	private Date dateCreated;
	
	@UpdateTimestamp
	private Date dateUpdated;

	private Date dateCompleted;
}
