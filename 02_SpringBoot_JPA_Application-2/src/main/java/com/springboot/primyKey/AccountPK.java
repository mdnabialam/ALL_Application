package com.springboot.primyKey;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class AccountPK implements Serializable {
	
	private Integer accId;
	private String accType;
	private String holderName;

}
