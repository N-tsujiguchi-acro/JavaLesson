package sampleJava4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleJava4_2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new  ArrayList<>();
		
		  for (int i = 1; i <= 10; i++) {
	             array.add(i);
	        }
		  
		  int i = 0;
	        while (i < array.size()) {
	            System.out.print(array.get(i));
	            i++;
	       }		 
	        
	        int j = 1;
	        int sum = 0;

	        while (j <= 100) {
	            sum += j;
	            j++;
	        }

	        System.out.print("合計は: " + sum+" ");
	        Scanner scanner = new Scanner(System.in);
	        int sums = 0;
	        int num;

	        System.out.println("整数を入力してください（0で終了）:");

	        num = scanner.nextInt();
	        while (num != 0) {
	            sums += num;
	            num = scanner.nextInt();
	        }

	        System.out.print("合計は: " + sums);
	        
	        int s = 1;
	        do {
	            System.out.println(s);
	            s++;
	        } while (s <= 10);
	        
	        int f = 1;
	        int summ = 0;

	        do {
	            summ += f;
	            f++;
	        } while (f <= 100);

	        System.out.print("合計は: " + summ + "");
	        
	        Scanner sca = new Scanner(System.in);
	        int sum1 = 0;
	        int num1;

	        do {
	            System.out.print("整数を入力してください（0で終了）: ");
	            num1 = sca.nextInt();
	            sum1 += num1;
	        } while (num1 != 0);

	        System.out.print("合計は: " + sum1);
	        
	        for (int k = 1; k <= 10; k++) {
	            System.out.println(k);
	        }
	        
	        int sum3 = 0;
	        for (int p = 1; p <= 100; p++) {
	            sum3 += p;
	        }
	        System.out.println("合計: " + sum3);
	        
	        int n1 = 1, n2 = 1;
	        System.out.print(n1 + " " + n2 + " ");

	        for (int l = 3; l <= 10; l++) {
	            int next = n1 + n2;
	            System.out.print(next + " ");
	            n1 = n2;
	            n2 = next;
	        }
	        int[] numbers = {1, 2, 3, 4, 5};

	        for (int num3 : numbers) {
	            System.out.println(num3);
	        }
	        
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("りんご");
	        fruits.add("バナナ");
	        fruits.add("オレンジ");

	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	        
	        int[] numberss = {1, 2, 3, 4, 5};
	        int sumde = 0;

	        for (int num4 : numberss) {
	            sumde += num4;
	        }

	        System.out.println("合計: " + sumde);
	        int[] numbers5 = {1, 2, 3, 4, 5};
	        
	        for (int number : numbers5) {
	            System.out.println(number);
	        }
	        
	        int[] numbers6 = {1, 2, 3, 4, 5};
	        int sum8 = 0;

	        for (int number : numbers6) {
	            sum8 += number;
	        }

	        System.out.println("合計: " + sum8);
	        
	        List<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");

	        for (String name : names) {
	            System.out.println(name);
	        }
	        for (int u = 1; u <= 10; u++) {
	            if (u == 5) {
	                break; // 5になったらループを終了
	            }
	            System.out.println(u);
	        }
	        int[] numbers4 = {1, 3, 5, 7, 9, 10};

	        for (int n : numbers4) {
	            if (n == 7) {
	                System.out.println("見つけた: " + n);
	                break;
	            }
	            System.out.println("チェック中: " + n);
	        }
	        
	        int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };

	            outerLoop: // ラベルを付ける
	            for (int x = 0; x < matrix.length; x++) {
	                for (int z = 0; z < matrix[x].length; z++) {
	                    if (matrix[x][z] == 5) {
	                        System.out.println("見つけた: " + matrix[x][z]);
	                        break outerLoop; // 外側のループごと中断
	                    }
	                    System.out.println("チェック中: " + matrix[x][z]);
	                }
	            }
	}
}
