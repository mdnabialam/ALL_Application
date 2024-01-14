package com.restful.nabi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.nabi.model.Movies;

public interface MoiveRepository extends JpaRepository<Movies, Serializable> {

}
