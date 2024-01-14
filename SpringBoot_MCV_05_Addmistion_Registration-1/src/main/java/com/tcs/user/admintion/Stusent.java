package com.tcs.user.admintion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stusent {
	
	//@NotEmpty(message = "Name is Required")
	//@Size(min = 3, message = "Name should be 3 to 8 characters")
	private String name;
	
	//@NotEmpty(message = "Fathe Name is Required ")
	private String fname;
	
	//@NotEmpty(message = "Phone Number is Required")
	//@Size(min = 10, message = "Atleast 10 digits")
	private String phone;
	
	//@Email(message = "Enter vaild E-mail Id ")
	//@NotEmpty(message = "Email is Required ")
	private String gmail;
	
	//@NotNull(message = "Age is Required")
	//@Min(value = 3, message = "Age should be minimum 3 years")
	//@Max(value = 16, message = "Age shouldn't cross 16 years")
	private Integer age;
	
	//@NotNull(message = "Govt Id is Required")
	//@Min(value = 5, message = "Min 5 digits")
	//@Max(value = 16, message = "Max 16 size ")
	private String gId;
}

