package com.example.games.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.Model.Qmodel;
import com.example.games.Repo.QRepo;


@RestController
public class Qcontroller 
{
	@Autowired
	QRepo qrep;
	
	//posting the given details\
	@PostMapping("/posting121")
	public String savedetails(@RequestBody Qmodel ques)
	{
		qrep.save(ques);
		return "Details added successfullys";
	}
	
	//deleting the given details 
	@DeleteMapping("delete121/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		qrep.deleteById(id);
		return "Deleted one2one successfully";
	}
	
	
}
