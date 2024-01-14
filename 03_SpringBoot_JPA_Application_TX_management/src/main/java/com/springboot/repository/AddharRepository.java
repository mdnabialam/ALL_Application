package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.AddharCard;

public interface AddharRepository extends JpaRepository<AddharCard,Serializable> {

}
