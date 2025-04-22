package sampleJava;

public class SampleJava1 {
	
      public static void main(String[] args) {
        int num = 5;
        int result = num * 2;
        System.out.println(num + "×2=" + result);
        
        int num1 = 12;
        if (num1 > 10) {
            System.out.println(num1 + " は 10 より大きいです。");
        } else {
            System.out.println(num1 + " は 10 以下です。");
        }
        
        int num2 = 7;
        if (num2 % 2 == 0) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }
        
        double num3 = 4.5;
        System.out.println("半分は " + (num3 / 2));
        
        double num4 = 7.8;
        int integerPart = (int) num4;
        double decimalPart = num4 - integerPart;
        System.out.println("整数部分: " + integerPart);
        System.out.println("小数部分: " + decimalPart);
        
        double num5 = 3.2;
        System.out.println("10倍: " + (num5 * 10));
        
        int num6 = 0;
        if (num6 == 0) {
            System.out.println("numは0です。");
        } else {
            System.out.println("numは0ではありません。");
        }
        
        int num7 = -5;
        if (num7 < 0) {
            System.out.println(num7 + " は負の数です。");
        } else {
            System.out.println(num7 + " は正の数または0です。");
        }
        
        int num8 = 15;
        if (num8 % 5 == 0) {
            System.out.println(num8 + " は5の倍数です。");
        } else {
            System.out.println(num8 + " は5の倍数ではありません。");
        }
        
        int n = 8;
        int nu = 3;
        int sum = n + nu;
        System.out.println("合計は: " + sum);
        
        int a = 10;
        int b = 4;
        int results = a - b;
        System.out.println("差は: " + results);
        
        int d = 6;
        int c = 7;
        int product = d * c;
        System.out.println("積は: " + product);
        
        String name = "のあ";
        int age = 25;
        age += 1;
        System.out.println(name + "は次の誕生日で" + age + "歳です。");
        
        int r = 8;
        int g = 3;
        
        System.out.println("足し算: " + (r + g));
        System.out.println("引き算: " + (r - g));
        System.out.println("掛け算: " + (r * g));
        System.out.println("割り算: " + (r / g));
        System.out.println("余り: " + (r % g));
        
        int test1 = 75;
        int test2 = 88;
        int test3 = 92;
        int total = test1 + test2 + test3;
        int average = total / 3;
        System.out.println("平均点: " + average);
        
        
        int price = 12000;
        double discount = price * 0.3;
        double finalPrice = price - discount;
        System.out.println("30%引き後の金額: " + (int)finalPrice + "円");
        
        
    }
}
