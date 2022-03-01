package com.springjpa.demo.MyJPA.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MyUser")
public class MyUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "uname")
	private String uname;
	@Column(name = "ph")
	private int ph;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuname() {
		return uname;
	}

	public void setuname(String uname) {
		this.uname = uname;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
	}

	public MyUser(String uname, int ph) {
		super();
		this.uname = uname;
		this.ph = ph;
	}

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", uname=" + uname + ", ph=" + ph + "]";
	}

}
