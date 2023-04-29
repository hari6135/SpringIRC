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
		
	@Query(value="select *from game_details",nativeQuery = true)
	public List<GameModel>getalldata();
	
	@Query(value="select * from game_details where a_id=:id",nativeQuery = true)
	public List<GameModel>ByPublisherName(@Param("id")int id);
	
	@Query(value="select *from game_details where a_id between :start and :end",nativeQuery = true)
	List<GameModel>startend(@Param("start")int start,@Param("end")int end);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from game_details where a_id=?1 and b_game_name=?2",nativeQuery = true)
	Integer deleteid(@Param("id")int id,@Param("name")String name);

	
}

