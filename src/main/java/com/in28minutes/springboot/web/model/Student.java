package com.in28minutes.springboot.web.model;

public class Student {
    private int id;
    private String name;
    private String sex;
    private String grade;
    private String address;
    

	public Student(int id, String name, String sex, String grade, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.grade = grade;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}