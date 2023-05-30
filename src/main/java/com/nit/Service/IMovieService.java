package com.nit.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.nit.Entity.Student;


public interface IMovieService {

	/*
	 * public String DeleteMovieEntry(Integer id); public String countAllMovie();
	 * public Movie getMovieById(Integer id); public List getMovieByids(List ids);
	 * public Iterable<Movie> saveAllMovies(List<Movie> list); public String
	 * updateMovieById(Integer id,Movie movie); public String
	 * deleteMovieById(Integer id); public String deleteAllMoviesById(List ids);
	 */
	public String AddMovieEntry(Student student);

}
