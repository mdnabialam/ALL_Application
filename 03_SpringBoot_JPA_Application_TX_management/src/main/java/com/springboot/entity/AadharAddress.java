package com.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Aadhar_Address_Info")
public class AadharAddress {
@Id
	private Integer id;
	private String vill;
	private String po;
	private Integer uuid;
	
}
