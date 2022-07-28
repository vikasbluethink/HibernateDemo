package com.hibernatedemo;

import java.util.List;

import javax.persistence.*;

@Entity
public class Question {
	
	@Id
	private int q_id;
	
	@Column
	private String question;
	
	@OneToMany
	private List<Answer> answer;
	
	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question() {
		super();
	}

}
