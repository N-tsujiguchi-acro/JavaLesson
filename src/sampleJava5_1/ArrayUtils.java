package sampleJava5_1;

public class ArrayUtils {
	
	public static int max (int[] a) {
		int max = a[0];
		for(int num : a) {
			if(num > max) {
				max = num;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {1, 3, 7, 2, 9};
        int maxValue = ArrayUtils.max(numbers);
        System.out.println("最大値: " + maxValue);
	}

}
