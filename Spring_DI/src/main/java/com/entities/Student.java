package com.entities;

public class Student {

	private int stud_id;
	private String name;
	private int age;
	private String city;
	 
	private College c;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_id, String name, int age, String city, College c) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.c = c;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public College getC() {
		return c;
	}

	public void setC(College c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", age=" + age + ", city=" + city + ", c=" + c + "]";
	}

	
}

