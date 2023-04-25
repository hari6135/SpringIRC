package com.example.Booking.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Booking.Model.BookingModel;
import com.example.Booking.Services.FlightService;

@RestController
public class FlightController
{
	@Autowired
	public FlightService cser;
	
	//posting the given details 
	@PostMapping("/booking")
	public BookingModel savedetails(@RequestBody BookingModel a)
	{
		return cser.savedetails(a);
	}
	
	
	//deleting the given details 
	@DeleteMapping("/booking/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "Deletion was successful";
	}
	
	
	//getting the details
	@GetMapping("/booking/{id}")
	public Optional<BookingModel> getdetails(@PathVariable("id")int id)
	{
		return cser.getdetails(id);
	}
	
	
	//update the given details
	@PutMapping("/update")
	public BookingModel updatedetails(@RequestBody BookingModel id)
	{
		return cser.updatedetails(id);
	}
}
