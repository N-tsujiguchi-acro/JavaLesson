package sampleJava4;

import java.util.Scanner;

public class SampleJava4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力してください");
		  Scanner scan = new Scanner(System.in);
		  
		  int s = scan.nextInt();
		  if(s%2 == 0) {
			  System.out.println("偶数です");
		  }else {
			  System.out.println("奇数です");
		  }
		  
		  System.out.println("整数を入力してください");
		  Scanner scan1 = new Scanner(System.in);
		  
		  int s1 = scan.nextInt();
		  
		  if(s1>-1) {
			  System.out.println("正の数です");
		  }else {
			  System.out.println("負の数です");
		  }
		  
		  System.out.println("整数を入力してください");
		  Scanner scan2 = new Scanner(System.in);
		  
		  int f = scan2.nextInt();
		  
		  Scanner scan3 = new Scanner(System.in);
		  
		  int g = scan3.nextInt();
		  
		  Scanner scan4 = new Scanner(System.in);
		  
		  int h = scan4.nextInt();
		  
		  if(f + g >h && g + h >f && f + h >g) {
			  System.out.println("これは有効な三角形です");
		  }else {
			  System.out.println("これは無効な三角形です");
		  }
		  
		  Scanner scanner = new Scanner(System.in);

		  System.out.print("年齢を入力してください: ");
	        int age = scanner.nextInt();

	        // 入場料の判定
	        if (age <= 12) {
	            System.out.println("入場料は無料です。");
	        } else if (age <= 59) {
	            System.out.println("入場料は1000円です。");
	        } else {
	            System.out.println("入場料は500円です。");
	        }

	        Scanner can = new Scanner(System.in);

	        System.out.print("曜日の番号（1〜7）を入力してください: ");
	        int day = can.nextInt();

	        String weekday;
	        switch (day) {
	            case 1: weekday = "日曜日"; break;
	            case 2: weekday = "月曜日"; break;
	            case 3: weekday = "火曜日"; break;
	            case 4: weekday = "水曜日"; break;
	            case 5: weekday = "木曜日"; break;
	            case 6: weekday = "金曜日"; break;
	            case 7: weekday = "土曜日"; break;
	            default: weekday = "無効な番号です"; break;
	        }

	        System.out.println("曜日: " + weekday);
		  
	        Scanner can1 = new Scanner(System.in);

	        System.out.print("月の番号（1〜12）を入力してください: ");
	        int month = can1.nextInt();

	        String monthName;
	        switch (month) {
	            case 1:  monthName = "1月 (January)"; break;
	            case 2:  monthName = "2月 (February)"; break;
	            case 3:  monthName = "3月 (March)"; break;
	            case 4:  monthName = "4月 (April)"; break;
	            case 5:  monthName = "5月 (May)"; break;
	            case 6:  monthName = "6月 (June)"; break;
	            case 7:  monthName = "7月 (July)"; break;
	            case 8:  monthName = "8月 (August)"; break;
	            case 9:  monthName = "9月 (September)"; break;
	            case 10: monthName = "10月 (October)"; break;
	            case 11: monthName = "11月 (November)"; break;
	            case 12: monthName = "12月 (December)"; break;
	            default: monthName = "無効な番号です"; break;
	        }

	        System.out.println("月: " + monthName);
	        
	        Scanner can2 = new Scanner(System.in);

	        System.out.print("成績（A, B, C, D, F）を入力してください: ");
	        String input = can2.next().toUpperCase(); // 小文字対応
	        char grade = input.charAt(0);

	        switch (grade) {
	            case 'A':
	                System.out.println("素晴らしい成績です！");
	                break;
	            case 'B':
	                System.out.println("よくできました！");
	                break;
	            case 'C':
	                System.out.println("合格です。");
	                break;
	            case 'D':
	                System.out.println("もう少し頑張りましょう。");
	                break;
	            case 'F':
	                System.out.println("不合格です。再挑戦しましょう！");
	                break;
	            default:
	                System.out.println("無効な成績です。A～Fで入力してください。");
	                break;
	        }
		  
	}

}
