package com.hibernatedemo;

import javax.persistence.*;

@Entity
public class Answer {
	
	@Id 
	private int a_id;
	
	@Column
	private String answer;
	
	@ManyToOne
	private Question question;
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
