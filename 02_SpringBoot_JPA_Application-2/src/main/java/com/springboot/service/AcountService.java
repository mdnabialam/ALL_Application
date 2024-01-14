package com.springboot.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.entity.Account;
import com.springboot.primyKey.AccountPK;
import com.springboot.repository.AcountRepository;

@Service
public class AcountService {
		
	private AcountRepository repository;
	
	public AcountService(AcountRepository repository) {
		this.repository=repository;
	}
	
	
	public void SetPkData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("CURRENT");
		pk.setHolderName("IBM");
		
		
		Optional<Account> byId = repository.findById(pk);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}
		
	}
	public void saveDate() {
		
		
		AccountPK pk = new AccountPK();
		pk.setAccId(102);
		pk.setAccType("SAVING");
		pk.setHolderName("SBI");
		
		Optional<Account> byId = repository.findById(pk);
		if (byId.isPresent()) {
			System.out.println(byId.get());
		}
		
		Account account = new Account();
		account.setBranchName("DMCC");
		account.setMinBal(5000.00);
		
		account.setAccountPK(pk);
		repository.save(account);
		
	}
	
	
	
	
}
