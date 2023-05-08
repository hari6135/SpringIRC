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

import com.example.loan.Models.LoanApplicationModel;
import com.example.loan.Servviiice.LoanServ;

@RestController
public class LoanController 
{
	@Autowired
	public LoanServ lser;
	
	@GetMapping("/loan/getall")
	public List<LoanApplicationModel> getuserloan()
	{
		return lser.getuserloan();
	}
	
	@PostMapping("/loan/post")
	public LoanApplicationModel postuserloan(@RequestBody LoanApplicationModel id)
	{
		return lser.postuserloan(id);
	}
	
	@PutMapping("/loan/put")
	public LoanApplicationModel updateuserloan(@RequestBody LoanApplicationModel id)
	{
		return lser.updateuserloan(id);
	}
	@DeleteMapping("/loan/delete/{id}")
	public String deletebyidloan(@PathVariable("id")int id)
	{
		lser.deletebyidloan(id);
		return"Deletion was successful";
	}
}
