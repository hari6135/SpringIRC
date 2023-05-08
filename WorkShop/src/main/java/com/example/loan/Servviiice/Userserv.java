package com.example.loan.Servviiice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.Models.UserModel;
import com.example.loan.Repositories.UserRepo;

@Service
public class Userserv 
{
	@Autowired
	public UserRepo urep;

	public List<UserModel> getuser() {
		// TODO Auto-generated method stub
		return urep.findAll();
	}

	public UserModel postuser(UserModel id) {
		// TODO Auto-generated method stub
		return urep.save(id);
	}

	public UserModel updateuser(UserModel id) {
		// TODO Auto-generated method stub
		return urep.saveAndFlush(id);
	}

	public void deleteid(int id) {
		// TODO Auto-generated method stub
		urep.deleteById(id);
	}
}
