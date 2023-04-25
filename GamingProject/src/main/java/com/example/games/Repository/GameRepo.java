package com.example.games.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.games.Model.GameModel;


public interface GameRepo extends JpaRepository<GameModel, Integer>
{
	
}
