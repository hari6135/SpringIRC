package com.example.Booking.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Booking.Model.BookingModel;

public interface FlightRepo extends JpaRepository<BookingModel, Integer> {

}
