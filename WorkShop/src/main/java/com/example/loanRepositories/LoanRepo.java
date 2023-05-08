package com.example.loanRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Models.LoanApplicationModel;

@Repository
public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
