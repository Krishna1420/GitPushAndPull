package com.spring_jdbc.entities;

public class Student {
private int id;
private String name;
private String cources;
private String address;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String cources, String address) {
	super();
	this.id = id;
	this.name = name;
	this.cources = cources;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCources() {
	return cources;
}
public void setCources(String cources) {
	this.cources = cources;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", cources=" + cources + ", address=" + address + "]";
}

}
