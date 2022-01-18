package com.javatpoint;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String qname;

	@ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "id")
	private List<Answer> answers;

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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}