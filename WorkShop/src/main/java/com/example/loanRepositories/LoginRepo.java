package com.example.loanRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Models.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
