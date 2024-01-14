package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Account;
import com.springboot.primyKey.AccountPK;

public interface AcountRepository extends JpaRepository<Account, AccountPK> {
	

}
