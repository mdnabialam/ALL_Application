package com.restful.nabi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "MOVIES_INFO")
@Data
@Entity
public class Movies {
	
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "moviceinfo"
		)
		@SequenceGenerator(
		    name = "moviceinfo"
		)
	
	@Id
	@Column(name = "Moive_ID")
	private Integer mId;
	@Column(name = "Moive_Name")
	private String moiveName;
	@Column(name = "Hero_Name")
	private String heroName;
	@Column(name = "Insvent_Amount")
	private double InsAmount;
	

}
