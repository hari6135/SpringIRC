package com.example.games.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.games.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> 
{

	 @Query(value = "select qno from question answer JOIN answer.ans",nativeQuery = true)
	    public List<Question> FindAll();
	 
}
