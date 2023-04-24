package com.example.games.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.Model.GameModel;
import com.example.games.Service.GameService;

@RestController
public class GameController 
{
	@Autowired
	public GameService cserv;
	
	//posting the given details
	@PostMapping("/gaming")
	public GameModel savedetails(@RequestBody GameModel obj)
	{
		return cserv.savedetails(obj);
	}
	
	//deleting the given details
	@DeleteMapping("/gaming/{id}")
	public String deletedetails(@PathVariable ("id")int id)
	{
		cserv.deletedetails(id);
		return "Deletion was successful";
		
	}
	
	//getting the given details
	@GetMapping("/gaming/{id}")
	public  Optional<GameModel> getdetails(@PathVariable ("id")int id)
	{
		return cserv.getdetails(id);
	}
	
	//updating the given details
	@PutMapping("/updategame")
	public GameModel updateDetails(@RequestBody GameModel id)
	{
		return cserv.updateInfo(id);
	}
}
