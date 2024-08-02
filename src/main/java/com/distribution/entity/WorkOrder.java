package com.distribution.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.distribution.dictionary.Skill;
import com.distribution.dictionary.Status;
import com.distribution.dictionary.Statuses;
import com.distribution.dictionary.TaskType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long callId;
	private int woNumber;
	
	@OneToOne
	private TaskType taskType;
	
	@OneToMany
	private List<Skill> skillsRequired;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="status")
	private Statuses status;
	
	@CreationTimestamp
	private Date dateCreated;
   
	private long latitute;
	
	private long longitute;

	@OneToOne
	//@Column(nullable=true)
	private Engineer enginner;
	
	@OneToMany
	//@Column(nullable=true)
	private List<FollowUpOrder> followUp;
	
	//@Column(nullable=true)
	private String completedBy;
	
	@UpdateTimestamp
	private Date dateUpdated;
	
	//@Column(nullable=true)
	private LocalDateTime dateCompleted;

	//@Column(nullable=true)
	private boolean preRequisite;
	
	
}
