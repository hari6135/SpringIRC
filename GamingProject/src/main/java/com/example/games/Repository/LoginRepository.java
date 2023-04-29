package com.example.games.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.games.Model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer>
{
	LoginModel findByUsername(String username);

}
