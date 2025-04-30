package com.example.app;

import static java.lang.Math.*;

import java.util.ArrayList;

public class Import_sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("ねこ");
		array.add("犬");
		array.add("ライオン");
		
		for(String s : array) {
			System.out.println(s);
		}
		
		double radius = 5.0; 
        double area = PI * radius * radius; 

        System.out.println("半径 " + radius + " の円の面積は: " +(int) area);
		

	}

}
