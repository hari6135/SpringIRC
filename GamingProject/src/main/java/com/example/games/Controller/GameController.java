package com.example.games.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.Model.GameModel;
import com.example.games.Repository.GameRepo;
import com.example.games.Service.GameService;




@RestController
public class GameController 
{
	@Autowired
	public GameService cserv;
	
	//posting the given details
	@PostMapping("/gaming")
	public GameModel savedetails(@RequestBody GameModel obj)
	{
		return cserv.savedetails(obj);
	}
	
	//deleting the given details
	@DeleteMapping("/gaming/{id}")
	public String deletedetails(@PathVariable ("id")int id)
	{
		cserv.deletedetails(id);
		return "Deletion was successful";
		
	}
	
	//getting the given details
	@GetMapping("/gaming/{id}")
	public  Optional<GameModel> getdetails(@PathVariable("id")int id)
	{
		return cserv.getdetails(id);
	}
	
	//updating the given details
	@PutMapping("/updategame")
	public GameModel updatedetails(@RequestBody GameModel id)
	{
		return cserv.updatedetails(id);
	}
	
	//Sorting the given details in ascending order
	@GetMapping("/sortasc/{pname}")
	public List<GameModel> sortasc(@PathVariable("pname")String pname)
	{
		return cserv.sortasc(pname);
	}
	
	//sorting the given details in descending order
	@GetMapping("/sortdesc/{pname}")
	public List<GameModel>sortdesc(@PathVariable("pname")String pname)
	{
		return cserv.sortdesc(pname);
	}
	
	//pagination data
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<GameModel> pagination(@PathVariable("pnu")int pnu,@PathVariable("psize")int psize)
	{
		return cserv.pagination(pnu,psize);
	}
	
	//pagination and sorting 
	@GetMapping("/pagination/{pnu}/{psize}/{pname}")
    public List<GameModel>paginationsorting(@PathVariable("pnu")int pnu,@PathVariable("psize")int psize,@PathVariable("pname")String pname)
    {
        return cserv.paginationsorting(pnu,psize,pname);
    }
	
	@Autowired
	public GameRepo ir;
	
	@GetMapping("savegame")
	public List<GameModel>getdata()
	{
		return ir.getalldata();
	}
	
	@GetMapping("/savegame/{id}")
	public List<GameModel>getname(@PathVariable("id")int id)
	{
		return ir.ByPublisherName(id);
	}
	
	@GetMapping("/startend/{start}/{end}")
	public List<GameModel> startendid(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return ir.startend(start, end);
	}
	
	@DeleteMapping("/delete/{id}/{name}")
	public String deleteid(@PathVariable("id")int id,@PathVariable("name")String name)
	{
		ir.deleteid(id, name);
		return "Deleted successfully"; 
	}
}
