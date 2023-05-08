package com.workshop.loan.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.Models.LoanApplicationModel;
import com.example.loan.Servviiice.LoanServ;

@RestController
public class LoanController {


	public class LoanApplicationController {
		
		@Autowired
		LoanServ lser;
		@GetMapping(value="/getAllLoans")
		public List<LoanApplicationModel> get()
		{
			List<LoanApplicationModel> l=lser.get();
			return l;
		}
		@PostMapping("/signup")
		public LoanApplicationModel addDetails(@RequestBody LoanApplicationModel u)
		{
			return lser.saveUser(u);
		}
		@DeleteMapping(value="/{id}")
		public String deleteById(@PathVariable int id)
		{
			lser.deletebyidloan(id);
			return "Deleted";
		}
		@PutMapping("/put")
		public LoanApplicationModel update(@RequestBody LoanApplicationModel um)
		{
		    return lser.updateuserloan(um);	
		}


	}
}

