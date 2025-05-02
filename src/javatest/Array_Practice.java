package javatest;

import java.util.ArrayList;

public class Array_Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fruitList = new ArrayList<String>();
		
		fruitList.add("リンゴ");
		fruitList.add("ばなな");
		fruitList.add("サクランボ");
		System.out.println(fruitList);
		
		fruitList.remove("ばなな");
		fruitList.add("オレンジ");
		
		System.out.println(fruitList);
		
	}

}
