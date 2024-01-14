package com.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Addhar_Card_Info")
public class AddharCard {
@Id
	private Integer uuId;
	private String uName;
	private Integer phone;
}
