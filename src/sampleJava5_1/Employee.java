package sampleJava5_1;

import java.util.Arrays;

public class Employee {
	
	
	public String checkMatch(int id, int[] ids) {
        for (int a : ids) {
            if (id == a) {
                return "一致しました: " + a + "、配列は: " + Arrays.toString(ids);
            }
        }
        return "一致しませんでした。";
	}

    public static void main(String[] args) {
        Employee s = new Employee();
        int[] arr = {3, 5, 7, 9};
        System.out.println(s.checkMatch(5, arr));
        Employee_1 s1 = new Employee_1();
        int[] arry = {4, 8, 10, 2};
        System.out.println(s1.checkMatch(0, arry));
    }

}
class Employee_1{
	public String checkMatch(int id, int[] ids) {
        for (int a : ids) {
            if (id == a) {
                return "一致しました: " + a + "、配列は: " + Arrays.toString(ids);
            }
        }
        return "一致しませんでした。";
	}

}