package com.restful.nabi.service;

import java.util.List;

import com.restful.nabi.exception.TouristNotFoundException;
import com.restful.nabi.model.Tourist;


public interface TouristService {

	// Add New Tourist
	public String registerTourist(Tourist  tourist);
	
	// Get All Tourist
	public List<Tourist> fetchAllTourist();
	
	// Get By Id
	
	public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException;

	// update 
	public String updateTourist(Tourist tourist) throws TouristNotFoundException;
	
	// Deleted
	public String deltedTourist(Integer tid) throws TouristNotFoundException;
	

}
