package com.example.games.Controller;

import java.util.List;
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

import io.swagger.v3.oas.annotations.tags.Tag;




@RestController
public class GameController 
{
	@Autowired
	public GameService cserv;
	
	//posting the given details
	@Tag(name="Posting",description = "Posting Data")
	@PostMapping("/gaming")
	public GameModel savedetails(@RequestBody GameModel obj)
	{
		return cserv.savedetails(obj);
	}
	
	//deleting the given details by id
	@Tag(name="Deleting",description = "Deleting Data by id")
	@DeleteMapping("/gaming/{id}")
	public String deletedetails(@PathVariable ("id")int id)
	{
		cserv.deletedetails(id);
		return "Deletion was successful";
		
	}
	
	//getting the given details by id
	@Tag(name="Get Details",description = "Get data by id")
	@GetMapping("/gaming/{id}")
	public  Optional<GameModel> getdetails(@PathVariable("id")int id)
	{
		return cserv.getdetails(id);
	}
	
	//updating the given details 
	@Tag(name="updating",description = "updating Data")
	@PutMapping("/updategame")
	public GameModel updatedetails(@RequestBody GameModel id)
	{
		return cserv.updatedetails(id);
	}
	
	//Sorting the given details in ascending order
	@Tag(name="Sorting ASC",description = "Sorting data in ascending order")
	@GetMapping("/sortasc/{pname}")
	public List<GameModel> sortasc(@PathVariable("pname")String pname)
	{
		return cserv.sortasc(pname);
	}
	
	//sorting the given details in descending order
	@Tag(name="Sorting DESC",description = "Sorting data in descending order")
	@GetMapping("/sortdesc/{pname}")
	public List<GameModel>sortdesc(@PathVariable("pname")String pname)
	{
		return cserv.sortdesc(pname);
	}
	
	//pagination data
	@Tag(name="Pagination",description = "Sorting data in ascending order")
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
	
	//get all data using Query
	@GetMapping("/savegame")
	public List<GameModel>getdata()
	{
		return ir.getalldata();
	}
	
	//get the required data by id using Query
	@GetMapping("/savegame/{id}")
	public List<GameModel>getname(@PathVariable("id")int id)
	{
		return ir.ByPublisherName(id);
	}
	
	//selecting the required data using start end query
	@GetMapping("/startend/{start}/{end}")
	public List<GameModel> startendid(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return ir.startend(start, end);
	}
	
	//deleting the details using start end query
	@DeleteMapping("/delete/{id}/{name}")
	public String deleteid(@PathVariable("id")int id,@PathVariable("name")String name)
	{
		ir.deleteid(id, name);
		return "Deleted successfully";
	}
	
	//updating the given details using query
	@PutMapping("/qup/{name}/{id}")
	public String updatee(@PathVariable("name")String name,@PathVariable("id")int id)
	{
		ir.update(name, id);
		return "Updation was successful";
	}
	
	//get by name using jpql
	@GetMapping("/jpqlget/{name}")
	public List<GameModel>getdetailname(@PathVariable("name")String name)
	{
		return ir.getjpqlname(name);
	}
	
	//jpql query for getting the details by name
	@GetMapping("/getbtw/{start}/{end}")
	public List<GameModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		
		return ir.getbtw(start, end);
	}
	//delete by jpql query by id
	@DeleteMapping("/deletejpql/{id}")
	public String deletejpqlid(@PathVariable("id")int id)
	{
		ir.deletejpqlid(id);
		return "Deleted successfully using JPQL Query !";
	}
	
	//update by jpql query
	@PutMapping("/jpqlup/{a}/{b}")
	public void updatejpql(@PathVariable("a")String a,@PathVariable("b")int b)
	{
		ir.updatejpql(a, b);
	}
}
