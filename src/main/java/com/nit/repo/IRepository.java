package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Entity.Student;

public interface IRepository extends JpaRepository<Student, Integer>{

	// working with @Query method custom method using HQL queries 
	//@Query("from Movie where id>?1 and id<?2")
	//public List<Movie> givesMovieBetRange(int id1, int id2);
	
	//@Query("select name from Movie where id>?1 and id<?2 order by id asc")
	//public List<Object[]> givesListOfMovieAndYear(int id1, int id2);
	//@Query("from movie where id=?1")
	//public Object giveMovie(int releaseDate);
	
	/*
	 * @Query("select name from movie where id=(select max(id) from movie)") 
	 * public Integer getValueWithDoubleSQLQuery();
	 */
}
