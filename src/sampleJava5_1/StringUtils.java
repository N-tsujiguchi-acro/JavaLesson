package sampleJava5_1;

public class StringUtils {
	
	public static String toUpperCase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 String result = StringUtils.toUpperCase("hello");
	     System.out.println("大文字変換: " + result);
	}

}
