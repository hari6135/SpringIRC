package com.example.loan.Servviiice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.Models.LoanApplicationModel;
import com.example.loan.Models.UserModel;
import com.example.loan.Repositories.LoanRepo;
import com.example.loan.Repositories.UserRepo;

@Service
public class LoanServ
{
		@Autowired
		UserRepo userRep;
		@Autowired
		LoanRepo lRep;
		public UserModel saveUser(UserModel l)
		{
			return userRep.save(l);
		}
		public String valideteUser(String email,String password)
		{
			String result=" ";
			UserModel l=userRep.findByEmail(email);
			if(l==null)
			{
				result="User not found";
			}
			else
			{
				if(l.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
			return result;
		}
		public List<UserModel> get()
		{
			List<UserModel> um=userRep.findAll();
			return um;
		}
		public LoanApplicationModel getById(int id)
		{
			LoanApplicationModel gbi=lRep.findById(id).get();
			return gbi;
			
		}
		public void deleteByID(int id) {
			userRep.deleteById(id);
		}
		public UserModel update(UserModel um) {
			return userRep.saveAndFlush(um);
		}

	}

