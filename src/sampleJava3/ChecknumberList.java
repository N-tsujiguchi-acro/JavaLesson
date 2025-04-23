package sampleJava3;


import java.util.ArrayList;

public class ChecknumberList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		ArrayList<String> b = new ArrayList<>();
		
		if(a>10) {
			System.out.println("large");
			b.add("large");
			for(String s : b) {
				System.out.println("値は"+s);
			}
		}else {
			System.out.println("small");
			b.add("small");
			for(String s : b) {
				System.out.println("値は"+s);
			}
		}
	}

}
