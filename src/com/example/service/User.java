package com.example.service;

import com.example.model.Model;

public class User {

	public boolean isAdult(Model m ) {
		return m.getAge() >=18;
	}

}
