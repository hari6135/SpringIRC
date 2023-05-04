package com.example.games.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;

@Entity
public class Qmodel
{
	@Id
	private int quesno;
	private String ques;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Amodel ans;

	public int getQuesno() {
		return quesno;
	}

	public void setQuesno(int quesno) {
		this.quesno = quesno;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public Amodel getAns() {
		return ans;
	}

	public void setAns(Amodel ans) {
		this.ans = ans;
	}
	
}
