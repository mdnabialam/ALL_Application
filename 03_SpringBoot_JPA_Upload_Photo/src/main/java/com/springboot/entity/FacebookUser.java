package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "FaceBookUser_Info")
@Entity
public class FacebookUser {
	
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "facebookUser"
		)
		@SequenceGenerator(
		    name = "facebookUser"
		)
	
	
	@Id
	@Column(name = "ID")
	private Integer fId;
	
	@Column(name = "Name")
	private String Name;
	
	@Column (name = "USER_NAME")
	private String userName;
	
	@Column (name = "PASSWORD")
	private String pw;
	
	@Column(name = "Photo")
	@Lob
	private byte[] userPhoto;
}
