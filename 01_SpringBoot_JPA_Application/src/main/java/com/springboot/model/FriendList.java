package com.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Friend_Info")
public class FriendList {

	@Id
	@Column
	private Integer fId;
	private String Fname;
	private String email;
	private Integer age;
	private String homecity;
	
}
