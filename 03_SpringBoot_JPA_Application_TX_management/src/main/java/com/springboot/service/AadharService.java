package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.AadharAddress;
import com.springboot.entity.AddharCard;
import com.springboot.repository.AddharRepository;
import com.springboot.repository.AddressRepositoy;

@Service
public class AadharService {

	@Autowired
	private AddressRepositoy addressRepositoy;
	
	@Autowired
	private AddharRepository addharRepository;
	
	@Transactional(rollbackFor = Exception.class)
	public  void SaveDate() {
		AddharCard addharCard = new AddharCard();
		
		addharCard.setUuId(102);
		addharCard.setUName("ALAM");
		addharCard.setPhone(77889966);
		
		addharRepository.save(addharCard);
		
		AadharAddress address = new AadharAddress();
		address.setId(103);
		address.setPo("BHINDASPUR");
		address.setVill("BHINDASPUR");
		address.setUuid(101);
		
		addressRepositoy.save(address);
		
		
	}
}
