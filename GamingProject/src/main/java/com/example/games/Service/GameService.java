package com.example.games.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.games.Model.GameModel;
import com.example.games.Repository.GameRepo;

@Service 
public class GameService 
{
	@Autowired
	public GameRepo repo;

	public GameModel savedetails(GameModel obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	public Optional<GameModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
		public GameModel updateInfo(GameModel id)
		{
			return repo.saveAndFlush(id);
		}
	
}
