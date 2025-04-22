package sampleJava2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SampleJava2 {
    public static void main(String[] args) {
        // その他の変数
        int num = 10;
        System.out.println("num =" + num);
        int a = 8;
        int b = 5;
        int sum = a + b;
        System.out.println("sum =" + sum);
        int width = 7;
        int height = 4;
        int area = width * height;
        System.out.println("area =" + area);

        String name = "java";
        System.out.println(name);

        double version = 17.0;
        System.out.println(version);

        boolean isFun = true;
        System.out.println(isFun);

        Scanner scan = new Scanner(System.in);
        System.out.println("名前を入力してください");

        String s = scan.nextLine();
        System.out.println("あなたのお名前は" + s + "さんですね！");

        String names = "辻口乃亜";
        int age = 25;
        String birthDate = "2000-5-2"; // 変数名を変更
        String result = String.format("名前: %s, 年齢: %d, 誕生日：%s", names, age, birthDate);
        System.out.println(result);

        // 商品の情報入力
        Scanner scan1 = new Scanner(System.in);
        System.out.println("商品の名前を入力してください:");
        String name1 = scan1.nextLine();

        System.out.println("商品の価格を入力してください:");
        int price = scan1.nextInt();

        System.out.println("購入個数を入力してください:");
        int numbers = scan1.nextInt();

        int total = price * numbers;
        System.out.println("商品「" + name1 + "」を" + numbers + "個買うと、合計金額は" + total + "円です。");

        scan1.close();

        // LocalDateの使用
        LocalDate today = LocalDate.now();

        // 誕生日（月日だけ指定）
        int birthMonth = 5;
        int birthDay = 2;

        // 今年の誕生日
        LocalDate birthdayThisYear = LocalDate.of(today.getYear(), birthMonth, birthDay);

        // 今日より前か同じなら、来年にする
        if (!birthdayThisYear.isAfter(today)) {
            birthdayThisYear = birthdayThisYear.plusYears(1);
        }

        // 日数を計算
        long daysUntil = ChronoUnit.DAYS.between(today, birthdayThisYear);

        System.out.println("次の誕生日まであと " + daysUntil + " 日です！");
    }
}

	


