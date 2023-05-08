 package com.example.loanRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Models.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
