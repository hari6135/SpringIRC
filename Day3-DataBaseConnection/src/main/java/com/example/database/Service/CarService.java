package com.example.database.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.Model.CarModel;
import com.example.database.Repository.CarRepo;

@Service
public class CarService 
{
	@Autowired
	public CarRepo crepo;
	public CarModel saveinfo(CarModel c)
	{
		return crepo.save(c);
	}
}
