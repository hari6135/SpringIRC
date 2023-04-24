package com.example.games.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.games.Model.GameModel;

@Repository
public interface GameRepo extends JpaRepository<GameModel, Integer>
{
	
}
