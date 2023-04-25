package com.example.Booking.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Booking.Model.BookingModel;
import com.example.Booking.Repo.FlightRepo;

@Service
public class FlightService 
{
	@Autowired
	public FlightRepo crepo;

	public BookingModel savedetails(BookingModel a) {
		// TODO Auto-generated method stub
		return crepo.save(a);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		crepo.deleteById(id);
	}

	public Optional<BookingModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return crepo.findById(id);
	}

	public BookingModel updatedetails(BookingModel id) {
		// TODO Auto-generated method stub
		return crepo.saveAndFlush(id);
	}


}
