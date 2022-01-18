package com.javatpoint;

import java.util.List;
import java.util.Set;

public class Question {
	private int id;
	private String qname;
	private Set<String> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> list1) {
		this.answers = list1;
	}
}