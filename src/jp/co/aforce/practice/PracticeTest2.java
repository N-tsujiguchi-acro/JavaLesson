package jp.co.aforce.practice;

public class PracticeTest2 {

	public static void main(String[] args) {
		// 題１
		double TAX = 0.1;
		System.out.println(TAX);
		// 題２
		int x = 480;
		double price = ((double) x * TAX) + x;
		System.out.println("480の税込み金額は"+(int)price + "円です");
		// 題3
		String name = "辻口乃亜";
		System.out.println(name);
		// 題4
		String str1 = "この商品の値段は";
		String str2 = "円です。";
		System.out.println(str1 + x + str2);
		
	}

}
