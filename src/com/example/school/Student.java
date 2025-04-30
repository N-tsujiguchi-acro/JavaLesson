package com.example.school;

public class Student {
	
	private int grade;
	private String name;
	
	public Student(int grade, String name) {
		super();
		this.grade = grade;
		this.name = name;
	}
	
	public void introduce() {
		System.out.println(name + "さんの学年は、" + grade +"です");
	}

	

}
