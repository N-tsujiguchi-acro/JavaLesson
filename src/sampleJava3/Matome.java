package sampleJava3;

import java.util.HashMap;
import java.util.Scanner;

public class Matome {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    HashMap<String, Integer> fru = new HashMap<>();

        // キーと値のペアを追加（国名と首都など）
        fru.put( "りんご",100);
        fru.put( "みかん",200);
        fru.put( "いちご",300);
        fru.put( "すいか",400);
        System.out.println("果物の名前を入力してください");
        Scanner scan = new Scanner(System.in);
        
        String key = scan.nextLine();
        
        if (fru.containsKey(key)) {
            int price = fru.get(key);
            System.out.println(key + " は " + price + "円です");
        } else {
            System.out.println("その果物は取り扱っていません。");
        }

	}

}
