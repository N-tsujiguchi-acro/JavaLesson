package com.example.app;

import com.example.utils.Helper;

public class Student {
	
	

	public static void main(String[] args) {
		
		com.example.school.Student s1 = new com.example.school.Student(5,"のあ");
		com.example.school.Student s2 = new com.example.school.Student(6,"みゆう");
		
		s1.introduce();
		s2.introduce();
		
		Helper p1 = new Helper("ヤッホー");
		
		p1.showMessage();
		
	    
		

	}

}
