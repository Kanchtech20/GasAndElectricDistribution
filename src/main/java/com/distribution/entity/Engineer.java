package com.distribution.entity;

import java.util.Date;
import java.util.List;

import com.distribution.dictionary.Skill;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Engineers")
public class Engineer {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="EngineerId")
	private int qId;
	
	private String name;
	
	private Date availabilityStart;
	
	private Date availabilityEnd;
	
	private long latitute;
	
	private long longitute;

	@OneToMany
	@JoinTable(name="EnginnerSkills")
	private List<Skill> skills;
	
	
	
	
	
	
}
