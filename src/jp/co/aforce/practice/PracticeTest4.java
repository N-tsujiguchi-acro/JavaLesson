package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		//題１
		ArrayList<String> strs = new  ArrayList<String>();
		
		strs.add("犬");
		strs.add("猫");
		strs.add("うさぎ");
		strs.add("蛇");
		//題２
		String str_1 = "猫";
		
		boolean t = false;
		
		for(String animal : strs) {
			if(str_1 == animal) {
				t = true;
			}
		}
		
		if(t == true) {
			System.out.println(str_1 + "は含まれます");
		}else {
			System.out.println(str_1 + "は含まれません");
		}
		
	}

}
