package jp.co.aforce.sample;

public class ExceptionPractice {

	public static void main(String[] args) {
		 String str = null;
		try {
			
			 System.out.println(str.length()); // →ここでヌルポが発生
			 
		} catch (NullPointerException e) {
		
			System.out.println("nullぽが発生" + e.getMessage());
		}
		
		
		String str1 = null;

		try{
			 int[] nums = {1, 2, 3};
		        System.out.println(nums[5]); //→ ArrayIndexOutOfBoundsException が発生
		}catch (NullPointerException e){
			 System.out.println("ヌルポが発生しました: " + e.getMessage());
		}

		System.out.println("プログラムは継続します");


	}

}
