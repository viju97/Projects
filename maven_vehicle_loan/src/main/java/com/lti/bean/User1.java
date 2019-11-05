package com.lti.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="user1")
public class User1 {
	
	@Id
	@Column(name="ID")
	private String id;
	

	@Column(name = "FIRSTNAME")
	private String name;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
