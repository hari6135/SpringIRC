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
	public UserRepo urepo;

	public List<UserModel> getuser() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	public UserModel postuser(UserModel id) {
		// TODO Auto-generated method stub
		return urepo.save(id);
	}

	public UserModel updateuser(UserModel id) {
		// TODO Auto-generated method stub
		return urepo.saveAndFlush(id);
	}

	public void deleteid(int id) {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
	}
}
