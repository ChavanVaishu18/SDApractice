package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Author {

@Id
@GeneratedValue (strategy =GenerationType.AUTO)
private int Aid;
private String AuthorName;
public int getAid() {
	return Aid;
}
public void setAid(int aid) {
	Aid = aid;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
@Override
public String toString() {
	return "Author [Aid=" + Aid + ", AuthorName=" + AuthorName + "]";
}

}
