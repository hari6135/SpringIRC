package com.example.games.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Gamedetails")
public class GameModel 
{
	@Id
	private int Id;
	
	private String GameName;
	
	private int ReleaseYear;
	
	private String PublisherName;
	
	private String GameGenre;
	
	private String PlatformName;
	
	private String CPURequirements;
	
	private String GPURequirements;
	
	private String GameSize;
	
	private int userid;
	
	private String username;
	
	private String password;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public int getReleaseYear() {
		return ReleaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		ReleaseYear = releaseYear;
	}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public String getGameGenre() {
		return GameGenre;
	}

	public void setGameGenre(String gameGenre) {
		GameGenre = gameGenre;
	}

	public String getPlatformName() {
		return PlatformName;
	}

	public void setPlatformName(String platformName) {
		PlatformName = platformName;
	}

	public String getCPURequirements() {
		return CPURequirements;
	}

	public void setCPURequirements(String cPURequirements) {
		CPURequirements = cPURequirements;
	}

	public String getGPURequirements() {
		return GPURequirements;
	}

	public void setGPURequirements(String gPURequirements) {
		GPURequirements = gPURequirements;
	}

	public String getGameSize() {
		return GameSize;
	}

	public void setGameSize(String gameSize) {
		GameSize = gameSize;
	}

	
}
	