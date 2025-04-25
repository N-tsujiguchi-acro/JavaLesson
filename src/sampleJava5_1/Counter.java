package sampleJava5_1;

public class Counter {
	static int count = 0;
	
	public Counter() {
		count ++;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Counter();
		new Counter();
		new Counter();
		
		System.out.println(count);
		
	}

}
