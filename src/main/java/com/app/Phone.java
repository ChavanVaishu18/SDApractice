package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Phone
{
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int id;
   private long number;
   private String type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Phone(long number, String type) {
	super();
	this.number = number;
	this.type = type;
}
@Override
public String toString() {
	return "Phone [id=" + id + ", number=" + number + ", type=" + type + "]";
}
   
}
