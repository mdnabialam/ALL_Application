package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.FacebookUser;

public interface FacebookRepository extends JpaRepository<FacebookUser,Serializable> {

}
