package sampleJava5_1;

public class Keisan {
	
	int a;
	int b;
	int c;
	
	
	
	public int showRsult(int a, int b, int c) {
		return a + b + c;
		
	}
	
	public int showRsult(int a, int b) {
		return a + b ;
		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Keisan k1 = new Keisan();
		Keisan k2 = new Keisan();
		
		System.out.println(k1.showRsult(1, 2));
		System.out.println(k2.showRsult(1, 2, 3));
		
	}

}
