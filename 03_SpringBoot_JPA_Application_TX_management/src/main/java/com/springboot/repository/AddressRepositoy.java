package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.AadharAddress;

public interface AddressRepositoy extends JpaRepository<AadharAddress,Serializable> {

}
