package com.example.database.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cars")
public class CarModel 
{
	@Id
	@Column(name="cid")
	private int cid;
	private String cname;
	private String cmodel;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmodel() {
		return cmodel;
	}
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
}
