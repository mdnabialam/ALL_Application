package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.FriendList;

public interface FriendRepository extends JpaRepository<FriendList, Serializable> {

}
