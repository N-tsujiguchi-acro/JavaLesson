package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		// 題１
		Random r = new Random(); 
		int fortune = (int)(Math.random() * 4) + 1;
		String str = "";
		switch(fortune) {
		
		case 1: str = "fortuneが１なら吉です";break;
		case 2: str = "fortuneが 2 なら中吉です";break;
		case 3: str = "fortuneが３なら大吉です";break;
		case 4: str = "fortuneが４なら凶です";break;
		
		}
		System.out.println(str);
		// 題２
		int i = 1;
		while(i<100) {
			
			if(i%7 == 0) {
				System.out.print(i + ",");
			}
			i++;
			
		}
		System.out.println("");
		// 題３
		for(int x =1; x<=9; x++ ) {
			for(int z = 1; z <=9; z++ ) {
				System.out.print(""+ x * z + "");
				System.out.print("");
			}
			System.out.println("");
		}
		// 題４
		 int num = 10;
		
	    for (int s= num; s <= num + 9; s++) {
            for (int j = num; j <= num + 9; j++) {
                System.out.printf("%4d", s * j); 
            }
            System.out.println(); 
	    }
	    // 題５
	    ArrayList<String> employees = new ArrayList<>();
        employees.add("斎藤");
        employees.add("田中");
        employees.add("山田");
        employees.add("鈴木");
        employees.add("高橋");

        ArrayList<String> submitters = new ArrayList<>();
        submitters.add("斎藤");
        submitters.add("高橋");

    
        for (String employee : employees) {
            if (!submitters.contains(employee)) {
                System.out.println("未提出者: " + employee);
            }
        }
        // 題6
        System.out.println("素数：");
        
        for (int h = 2; h <= 100; h++) {
            boolean isPrime = true; 

            for (int j = 2; j < h; j++) {
                if (h % j == 0) {
                    isPrime = false; 
                    break;
                }
            }
            
            if (isPrime) {
            	
                System.out.print(h + ",");
            }
        }
	    
	}

}
