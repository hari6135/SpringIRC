package com.example.games.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.games.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> 
{	
	
	 //getting all details using native query
		@Query(value="select *from question",nativeQuery = true)
		public List<Question>getalldata();
}
