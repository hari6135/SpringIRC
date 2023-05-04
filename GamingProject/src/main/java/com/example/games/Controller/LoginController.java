
package com.example.games.Controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.Model.LoginModel;
import com.example.games.Service.LoginService;


@RestController
public class LoginController 
{
	
	@Autowired
	public LoginService lser;
	
	
	//posting the details 
	@PostMapping("/post")
	public LoginModel adddetails(@RequestBody LoginModel id)
	{
		return lser.adddetails(id);
	}
	
	//getting the details 
	@GetMapping("/get/{id}")
	public Optional<LoginModel> getdetails(@PathVariable("id")int id)
	{
		return lser.getdetails(id);
	}
	
	//delete
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")int id)
	{
		lser.delete(id);
		return"deleted succesfully";
	}
	
	//login
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> logindata)
	{
		String username = logindata.get("username");
		String password = logindata.get("password");
		String result = lser.checklogin(username,password);
		return result;
	}
}
