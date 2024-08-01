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

import jakarta.persistence.Entity;
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
	private String callId;
	private int woNumber;
	
	@OneToOne
	private TaskType taskType;
	
	@OneToMany
	private List<Skill> skillsRequired;
	
    @OneToOne
	private Statuses status;
	
	@CreationTimestamp
	private Date dateCreated;
   
	private long latitute;
	
	private long longitute;

	@OneToOne
	private Engineer enginner;
	
	@OneToMany
	private FollowUpOrder followUp;
	
	private String completedBy;
	
	@UpdateTimestamp
	private Date dateUpdated;
	
	private LocalDateTime dateCompleted;

	private boolean preRequisite;
	
	
}
