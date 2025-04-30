package com.example.app;

import com.example.model.Model;
import com.example.service.User;

public class Adult {

	public static void main(String[] args) {
		
		Model m1 = new Model("たろう", 20); 
        User u = new User();

        System.out.println("名前: " + m1.getName());
        System.out.println("年齢: " + m1.getAge());

        if (u.isAdult(m1)) {
            System.out.println("大人です");
        } else {
            System.out.println("子供です");
        }

	}

}
