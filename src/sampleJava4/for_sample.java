package sampleJava4;

import java.util.ArrayList;

public class for_sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 3; i++) {
		    for(int j = 0; j < 3; j++) {
		        System.out.println("i = " + i + ", j = " + j);
		    }
		}
		
		String[] s = {"りんご","みかん","すいか"};
		
		for(String fruits : s) {
			System.out.println(fruits);
		}
		
		//問題１
		ArrayList<Integer> stu_num = new ArrayList<Integer>();
		
		stu_num.add(85);
		stu_num.add(92);
		stu_num.add(78);
		stu_num.add(65);
		stu_num.add(98);
		stu_num.add(70);
		
		int count = 0;
		
		for(int a : stu_num) {
			
			
			
			if(a>=70) {
				count += 1;
			}
			
		}
		
		System.out.println("70点以上の得点の数は"+ count + "個");
		
		
	}

}
