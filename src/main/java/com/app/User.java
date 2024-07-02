package com.app;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;
@Entity
public class User
{
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String name;
	@OneToMany(targetEntity = Phone.class,cascade=CascadeType.ALL)
	List<Phone> phones=new ArrayList<Phone>();
	
	//private Object phones;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + "]";
	}
}
