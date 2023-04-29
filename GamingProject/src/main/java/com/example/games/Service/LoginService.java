package com.example.games.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.games.Model.LoginModel;
import com.example.games.Repository.LoginRepository;


@Service
public class LoginService 
{
	@Autowired
	public LoginRepository lrep;

	public String checklogin(String username, String password) {
		// TODO Auto-generated method stub
		LoginModel user=lrep.findByUsername(username);
		if(user==null)
		{
			return"No User Found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return"Login successfull";
			}
			else
			{
				return"Login failed";
			}
		}
	}
	public LoginModel adduser(LoginModel game)
	{
		return lrep.save(game);
	}
	public List<LoginModel>getuser()
	{
		return lrep.findAll();
	}
	public LoginModel adddetails(LoginModel id) {
		// TODO Auto-generated method stub
		return lrep.save(id);
	}
}
