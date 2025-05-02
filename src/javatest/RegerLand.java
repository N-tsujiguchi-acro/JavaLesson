package javatest;

import java.util.Scanner;

public class RegerLand {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("年齢を入力してください");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
	
		
		if(a >= 0 && a<4) {
			System.out.println("無料");
		}else if(a <13){
			System.out.println("500円");
		}else if(a <18){
			System.out.println("800円");
		}else if(a <60){
			System.out.println("1200円");
		}else if(a >= 60 && a < 101) {
			System.out.println("700円");
		}else {
			System.out.println("不正な年齢です。もう一度入力してください");
		}
		

	}

}
