package sampleJava3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			ArrayList<String> fruitList = new ArrayList<String>();
			
			fruitList.add("リンゴ");
			fruitList.add("スイカ");
			fruitList.add("イチゴ");
			
			for(int i=0; i<fruitList.size(); i++) {
				System.out.println(fruitList.get(i));
			}
			Set<Integer> numList = new HashSet<>();

	        numList.add(2);
	        numList.add(1);
	        numList.add(1);  // 重複なので無視される
	        numList.add(3);

	        System.out.println(numList); 
	        int a = 50;
	        int b = 50;
	        if(a==b) {
	        	System.out.println("aとbは同じ");
	        }
	        boolean isRany = true;
	        if(isRany) {
	        	System.out.println("傘を持っていこう");
	        	
	        }
	        int tempature = 25;
	        if(tempature >=30) {
	        	System.out.println("真夏日です");
	        }else {
	        	System.out.println("冬です");
	        }
	        int score = 75;
	        if(score >= 80) {
	        	System.out.println("優");
	        }else if(score 	>=70){
	        	System.out.println("良");
	        }else {
	        	System.out.println("不可");
	        }
	        
	        int time =18 ;
	        boolean isHoliday = false;
	        
	        if(9 > time || time>18 || isHoliday) {
	        	System.out.println("勤務時間外です");
	        }else {
	        	System.out.println("勤務時間内です");
	        }
	        
	        boolean hasLicense = true;
	        boolean hasCar = true;
	        
	        if(hasLicense) {
	        	System.out.println("運転免許証はもっています");
	        	if(hasCar) {
	        		System.out.println("車も持っています");
	        	}else {
	        		System.out.println("しかし車は持っていません");
	        	}
	        }else {
	        	System.out.println("何ももっていません");
	        }
	        String color = "yellow";
	        String message;

	        switch (color) {
	            case "red":
	                message = "停止してください。";
	                break;
	            case "yellow":
	                message = "注意してください。";
	                break;
	            case "green":
	                message = "進んでください。";
	                break;
	            default:
	                message = "不正な信号の色です。";
	        }

	        System.out.println("現在の信号: " + color + " - " + message);
	        
	        
	}

}
