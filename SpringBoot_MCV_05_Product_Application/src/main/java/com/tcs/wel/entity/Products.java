package com.tcs.wel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	
	private Integer productId;
	private String productName;
	private String productBrand;
	private double productPrice;
}

