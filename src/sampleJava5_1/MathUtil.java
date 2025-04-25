package sampleJava5_1;

public class MathUtil {
	
	
	 public static int sum(int... numbers) {
	        int total = 0;
	        for (int n : numbers) {
	            total += n;
	        }
	        return total;
	  }
	  public static void main(String[] args) {
	        // 問2の動作確認
	        Rectangle r1 = new Rectangle(10, 20); 
	        Rectangle r2 = new Rectangle(15);     

	        r1.printSize(); 
	        r2.printSize(); 

	        // 問3の動作確認
	        int result = MathUtil.sum(5, 10, 15, 20);
	        System.out.println("合計: " + result); 
	   }
}

