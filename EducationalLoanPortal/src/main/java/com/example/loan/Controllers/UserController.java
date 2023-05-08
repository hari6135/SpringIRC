package com.example.loan.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.Models.UserModel;
import com.example.loan.Servviiice.Userserv;

@RestController
public class UserController 
{
	@Autowired
	public Userserv user;
	@GetMapping("/user/getall")
	public List<UserModel> getuser()
	{
		return user.getuser();
	}
	
	@PostMapping("/user/post")
	public UserModel postuser(@RequestBody UserModel id)
	{
		return user.postuser(id);
	}
	
	@PutMapping("/user/put")
	public UserModel updateuser(@RequestBody UserModel id)
	{
		return user.updateuser(id);
	}
	@DeleteMapping("/user/delete/{id}")
	public String deleteid(@PathVariable("id")int id)
	{
		user.deleteid(id);
		return"Deletion was successful";
	}
}
