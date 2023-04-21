package com.example.database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.Model.CarModel;

public interface CarRepo extends JpaRepository<CarModel, Integer>
{

}
