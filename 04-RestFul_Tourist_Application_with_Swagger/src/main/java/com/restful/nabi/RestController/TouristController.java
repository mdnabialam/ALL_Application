package com.restful.nabi.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.nabi.model.Tourist;
import com.restful.nabi.service.TouristService;

@RestController
@RequestMapping("/tourist")
public class TouristController {
	
	@Autowired
	private TouristService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist){
		
		try {
			String result=service.registerTourist(tourist);
			return new ResponseEntity<String>(result,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in Enrollment . .",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTourist(){
		try {
			List<Tourist> list= service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in Fetcing Tourist . .",HttpStatus.OK);
		}
	}
	@GetMapping("/find/{tid}")
	public ResponseEntity<?> findById(@PathVariable("tid") Integer tid){
		try {
			Tourist tourist= service.fetchTouristById(tid);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// update 
	@PutMapping("/modify")
	public ResponseEntity<String> modifyTourist(@RequestBody Tourist tourist){
		try {
			String msg= service.updateTourist(tourist);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// Deleted
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletedTourist(@PathVariable("id") Integer id){
		try {
			String msg= service.deltedTourist(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
			
		}
	}
	

}
