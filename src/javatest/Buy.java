package javatest;

import java.util.Scanner;

public class Buy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("商品の単価を入力してください");
        int a = scan.nextInt(); 

        System.out.println("購入個数を入力してください");
        int b = scan.nextInt(); 

      
        double c = ((double) a * 1.1) * b;
        System.out.println("割引前の合計金額は " + (int) c + " 円");

     
        double w1 = 0.95; 
        double w2 = 0.9;  

        
        double discounted = c;
        int discountBonus = 0;

        if (a >= 10000) {
            discounted = c * w2;
        } else if (a >= 5000) {
            discounted = c * w1;
        }

   
        if (b >= 5) {
            discountBonus = b * 100;
        } else if (b >= 3) {
            discountBonus = b * 50;
        }
        System.out.println("割引額は");
        System.out.println((int)c - (int)discounted);
        
        System.out.println("消費税率は10%");
       
        if (a >= 5000) {
            System.out.println("割引後の金額は " + ((int) discounted + discountBonus) + " 円（割引含む）");
        } else  {
            System.out.println("割引対象ではありません");
        }

        scan.close();
    }
}

