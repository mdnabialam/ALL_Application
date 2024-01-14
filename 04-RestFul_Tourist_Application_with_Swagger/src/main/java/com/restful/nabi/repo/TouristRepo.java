package com.restful.nabi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.nabi.model.Tourist;

public interface TouristRepo extends JpaRepository<Tourist, Integer> {

}
