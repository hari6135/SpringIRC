package com.example.games.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.games.Model.GameModel;

import jakarta.transaction.Transactional;

public interface GameRepo extends JpaRepository<GameModel, Integer>
{
	
	// getting all details using native query
	@Query(value="select *from gamedetails",nativeQuery = true)
	public List<GameModel>getalldata();
	
	//getting the details using id in native query
	@Query(value="select * from gamedetails where id=:id",nativeQuery = true)
	public List<GameModel>ByPublisherName(@Param("id")int id);
	
	//getting the details from to native query
	@Query(value="select *from gamedetails where id between :start and :end",nativeQuery = true)
	List<GameModel>startend(@Param("start")int start,@Param("end")int end);
	
	//deleting the details from id using native query
	@Modifying
	@Transactional
	@Query(value="delete from gamedetails where id=?1 and gname=?2",nativeQuery = true)
	Integer deleteid(int id,String name);
	
	//update the details from id using native query
	@Modifying
	@Transactional
	@Query(value="update gamedetails set gname=?1 where id=?2",nativeQuery = true)
	public void update(String name, int id);

	//jpql query for getting the details by name
	@Query("select g from GameModel g where gname=?1")
	public List<GameModel> getjpqlname(String name);
	
	//jpql query for getting the details using btw
	@Query("select g from GameModel g where id between ?1 and ?2")
	public List<GameModel>getbtw(int start,int end);
	
	//jpql query for deleting the details by id
	@Modifying
	@Transactional
	@Query("delete from GameModel where id=?1")
	public void deletejpqlid(int id);
	
	//jpql query for updating the details 
	@Modifying
	@Transactional
	@Query("update GameModel set publisher=?1 where id=?2")
	public void updatejpql(String a,int b);

}