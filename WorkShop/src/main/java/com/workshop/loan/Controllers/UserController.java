package com.workshop.loan.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.Models.LoanApplicationModel;
import com.example.loan.Models.UserModel;
import com.example.loan.Servviiice.Userserv;

@RestController
public class UserController 
{
		@Autowired
		Userserv userSer;
		@PostMapping("/login")
		public String validateUser(@RequestBody UserModel u)
		{
			return userSer.valideteUser(u.getEmail(), u.getPassword());
		}
		
		@PostMapping("/signup")
		public UserModel addDetails(@RequestBody UserModel u)
		{
			return userSer.saveUser(u);
		}
		@GetMapping(value="/getProfile")
		public List<UserModel> get()
		{
			List<UserModel> s=userSer.get();
			return s;
		}
		@GetMapping(value="/viewLoan/{user}")
		public LoanApplicationModel getById(@PathVariable int user)
		{
			LoanApplicationModel gbi=userSer.getById(user);
			return gbi;	
		}
		@DeleteMapping(value="/{id}")
		public String deleteById(@PathVariable int id)
		{
			userSer.deleteByID(id);
			return "Deleted";
		}
		@PutMapping("/put")
		public UserModel update(@RequestBody UserModel um)
		{
		    return userSer.update(um);	
		}

	}
}
