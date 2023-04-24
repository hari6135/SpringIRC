package com.example.games.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GameDetails")
public class GameModel 
{
	@Id
	private int a_Id;
	
	private String b_Game_Name;
	
	private int d_Release_Year;
	
	private String e_Publisher_Name;
	
	private String c_Game_Genre;
	
	private String f_Platform_Name;
	
	private String g_CPU_Requirements;
	
	private String h_GPU_Requirements;
	
	private String i_Game_Size;

	public int getA_Id() {
		return a_Id;
	}

	public void setA_Id(int a_Id) {
		this.a_Id = a_Id;
	}

	public String getB_Game_Name() {
		return b_Game_Name;
	}

	public void setB_Game_Name(String b_Game_Name) {
		this.b_Game_Name = b_Game_Name;
	}

	public int getD_Release_Year() {
		return d_Release_Year;
	}

	public void setD_Release_Year(int d_Release_Year) {
		this.d_Release_Year = d_Release_Year;
	}

	public String getE_Publisher_Name() {
		return e_Publisher_Name;
	}

	public void setE_Publisher_Name(String e_Publisher_Name) {
		this.e_Publisher_Name = e_Publisher_Name;
	}

	public String getC_Game_Genre() {
		return c_Game_Genre;
	}

	public void setC_Game_Genre(String c_Game_Genre) {
		this.c_Game_Genre = c_Game_Genre;
	}

	public String getF_Platform_Name() {
		return f_Platform_Name;
	}

	public void setF_Platform_Name(String f_Platform_Name) {
		this.f_Platform_Name = f_Platform_Name;
	}

	public String getG_CPU_Requirements() {
		return g_CPU_Requirements;
	}

	public void setG_CPU_Requirements(String g_CPU_Requirements) {
		this.g_CPU_Requirements = g_CPU_Requirements;
	}

	public String getH_GPU_Requirements() {
		return h_GPU_Requirements;
	}

	public void setH_GPU_Requirements(String h_GPU_Requirements) {
		this.h_GPU_Requirements = h_GPU_Requirements;
	}

	public String getI_Game_Size() {
		return i_Game_Size;
	}

	public void setI_Game_Size(String i_Game_Size) {
		this.i_Game_Size = i_Game_Size;
	}
}
	