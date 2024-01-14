package com.restful.nabi.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.nabi.model.Movies;
import com.restful.nabi.service.MoviceService;

@RestController
@RequestMapping("/movie")
public class MoviesRestController {

	@Autowired
	private MoviceService service;
	
	
	
	// Save Date
	@PostMapping("/new")
	public ResponseEntity<String> addMovive(@RequestBody Movies  movies){
		String msg= service.upsertMovice(movies);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	// get All Date
	@GetMapping("/alllist")
	public ResponseEntity<List<Movies>> getAllDate(){
		List<Movies> allmovie=service.getAllMovies();
		return new ResponseEntity<>(allmovie,HttpStatus.OK);
	}
	// update
	@PutMapping("/update")
	public ResponseEntity<String> updatemovie(@RequestBody Movies movies){
		String msg = service.upsertMovice(movies);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	// Delete by Id
	@DeleteMapping("/movie/{mId}")
	public ResponseEntity<String> deletebook(@RequestBody Integer mId){
		String msg = service.deleteMovie(mId);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
}
