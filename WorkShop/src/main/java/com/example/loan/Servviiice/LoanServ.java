package com.example.loan.Servviiice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.Models.LoanApplicationModel;
import com.example.loanRepositories.LoanRepo;

@Service
public class LoanServ
{
	@Autowired
	public LoanRepo lrep;

	public List<LoanApplicationModel> getuserloan() {
		// TODO Auto-generated method stub
		return lrep.findAll();
	}

	public LoanApplicationModel postuserloan(LoanApplicationModel id) {
		// TODO Auto-generated method stub
		return lrep.save(id);
	}

	public LoanApplicationModel updateuserloan(LoanApplicationModel id) {
		// TODO Auto-generated method stub
		return lrep.saveAndFlush(id);
	}

	public void deletebyidloan(int id) {
		// TODO Auto-generated method stub
		lrep.deleteById(id);
	}
}
