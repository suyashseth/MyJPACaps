package com.jpa.one_to_many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@Column(name = "pid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	@Column(name = "name")
	private String name;
	
	@JoinColumn
	@OneToMany(cascade = CascadeType.ALL)
	private List<Account>acc;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getAcc() {
		return acc;
	}
	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", acc=" + acc + "]";
	}
	
	
	
}
