package com.example.Booking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flight")
public class BookingModel 
{
	@Id
	private String a_FlightNo;

	private String b_PassangerName;

	private String c_Dob;

	private String d_Email;

	private String e_Address;

	private String f_From;

	private String g_To;

	private String h_DepartureDate;

	private String i_ArrivalDate;

	private String j_SeatClass;

	private String k_ContactNumber;

	public String getA_FlightNo() {
		return a_FlightNo;
	}

	public void setA_FlightNo(String a_FlightNo) {
		this.a_FlightNo = a_FlightNo;
	}

	public String getB_PassangerName() {
		return b_PassangerName;
	}

	public void setB_PassangerName(String b_PassangerName) {
		this.b_PassangerName = b_PassangerName;
	}

	public String getC_Dob() {
		return c_Dob;
	}

	public void setC_Dob(String c_Dob) {
		this.c_Dob = c_Dob;
	}

	public String getD_Email() {
		return d_Email;
	}

	public void setD_Email(String d_Email) {
		this.d_Email = d_Email;
	}

	public String getE_Address() {
		return e_Address;
	}

	public void setE_Address(String e_Address) {
		this.e_Address = e_Address;
	}

	public String getF_From() {
		return f_From;
	}

	public void setF_From(String f_From) {
		this.f_From = f_From;
	}

	public String getG_To() {
		return g_To;
	}

	public void setG_To(String g_To) {
		this.g_To = g_To;
	}

	public String getH_DepartureDate() {
		return h_DepartureDate;
	}

	public void setH_DepartureDate(String h_DepartureDate) {
		this.h_DepartureDate = h_DepartureDate;
	}

	public String getI_ArrivalDate() {
		return i_ArrivalDate;
	}

	public void setI_ArrivalDate(String i_ArrivalDate) {
		this.i_ArrivalDate = i_ArrivalDate;
	}

	public String getJ_SeatClass() {
		return j_SeatClass;
	}

	public void setJ_SeatClass(String j_SeatClass) {
		this.j_SeatClass = j_SeatClass;
	}

	public String getK_ContactNumber() {
		return k_ContactNumber;
	}

	public void setK_ContactNumber(String k_ContactNumber) {
		this.k_ContactNumber = k_ContactNumber;
	}

	
}
