package com.restful.nabi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.nabi.model.Movies;
import com.restful.nabi.repository.MoiveRepository;
import com.restful.nabi.service.MoviceService;


@Service
public class MoviesImpl implements MoviceService {

	@Autowired
	private MoiveRepository repository;
	
	
	// Save and update
	@Override
	public String upsertMovice(Movies movies) {
		
		Integer mId= movies.getMId();
		
		System.out.println(mId);
		
		repository.save(movies);
		
		System.out.println(movies);
		
		if (mId == null) {
			return "Recode Inserted";
		} else {
			return "Recode Update";
		}
	
	}
	// get All date
	@Override
	public List<Movies> getAllMovies() {
		return repository.findAll();
	}
// Delete by Id
	@Override
	public String deleteMovie(Integer MoviesId) {
		repository.deleteById(MoviesId);
		return "Movie was Deleted";
	}

}
