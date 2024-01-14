package com.restful.nabi.service;

import java.util.List;

import com.restful.nabi.model.Movies;

public interface MoviceService {
	
	public String upsertMovice(Movies movies);
	public List<Movies> getAllMovies();
	public String deleteMovie(Integer MoviesId);

}
