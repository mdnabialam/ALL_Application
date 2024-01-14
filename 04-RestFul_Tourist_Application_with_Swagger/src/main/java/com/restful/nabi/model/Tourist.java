package com.restful.nabi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tourist_Info")
public class Tourist {
	
	
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "TouristInfoSeq"
		)
		@SequenceGenerator(
		    name = "TouristInfoSeq"
		)
	@Id
	private Integer tid;
	@Column(name = "Tourist_Name",length = 20)
	private String name;
	@Column(name = "Tourist_City",length = 30)
	private String city;
	@Column(name = "Tourist_packagetype",length = 40)
	private String packageType;
	@Column(name = "Tourist_Budget")
	private Double budget;
}
