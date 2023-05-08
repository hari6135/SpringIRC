package com.example.games.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.Model.Question;
import com.example.games.Repo.QuestionRepo;

@RestController
public class QuestionController 
{
	@Autowired
	QuestionRepo qrepo;
	
	//Posting the given details 
	@PostMapping("/postmany")
	public String savedetails(@RequestBody Question q)
	{
		qrepo.save(q);
		return "Data is saved successfully";
	}
	
	//Deleting the given details 
	@DeleteMapping("/delete/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		qrepo.deleteById(id);
		return "Deleted successfully";
	}
	//getting the details by joining
	@GetMapping("/get")
	public  String getdetails()
	{
		qrepo.getalldata();
		return "Get complete";
	}
}
