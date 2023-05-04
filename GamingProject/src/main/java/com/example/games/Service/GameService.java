package com.example.games.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.games.Model.GameModel;
import com.example.games.Repository.GameRepo;

@Service 
public class GameService 
{
	@Autowired
	public GameRepo repo;

	//posting the details
	public GameModel savedetails(GameModel obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	//deleting the details
	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	//getting the details
	public Optional<GameModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	
	//updating the given details
	public GameModel updatedetails(GameModel id)
	{
		// TODO Auto-generated method stub
		return repo.saveAndFlush(id);
	}

	//sorting in ascending order
	public List<GameModel> sortasc(String pname) {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(pname).ascending());
	}

	//sorting in descending order
	public List<GameModel> sortdesc(String pname) {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(pname).descending());
	}

	//pagination
	public List<GameModel> pagination(int pnu, int psize) {
		// TODO Auto-generated method stub
		Page<GameModel> p=repo.findAll(PageRequest.of(pnu, psize));
		return p.getContent();
	}
	
	//pagination and sorting
	public List<GameModel> paginationsorting(int pnu, int psize, String pname) {
		// TODO Auto-generated method stub
			Page<GameModel>p= repo.findAll(PageRequest.of(pnu, psize, Sort.by(pname).descending()));
			return p.getContent();		
			}
	
	//
}
