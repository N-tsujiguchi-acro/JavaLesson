package sampleJava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SampleJava3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("逆に出力");
		
		
		for(int s = 4; s >= 0; s--) {
		    System.out.println(a.get(s));
		}
		
		  // ArrayListを作成
        ArrayList<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(2); 
        d.add(1);

        System.out.println("ArrayList: " + d);

        // HashSetに変換（重複は自動的に削除される）
        Set<Integer> set = new HashSet<>(d);

        System.out.println("HashSet: " + set);
        // ArrayListの作成
        ArrayList<String> fruits = new ArrayList<>();

        // 要素の追加（順番どおり）
        fruits.add("リンゴ");
        fruits.add("バナナ");
        fruits.add("さくらんぼ");

        // 「バナナ」を削除
        fruits.remove("バナナ");

        // 「オレンジ」を追加
        fruits.add("オレンジ");

        // 結果をコンソールに出力
        System.out.println("現在のフルーツ一覧:");
        for (String fruit : fruits) {
            System.out.println(fruit);
            
        }
        LinkedList<String> items = new LinkedList<>();

        // 要素を追加
        items.add("赤");
        items.add("青");
        items.add("緑");
        items.add("黄色");

        // 最初の要素を取得（getFirstでもOK）
        String first = items.getFirst();

        // 最後の要素を取得（getLastでもOK）
        String last = items.getLast();

        // 結果の出力
        System.out.println("リストの最初の要素: " + first);
        System.out.println("リストの最後の要素: " + last);
        
        ArrayList<Integer> numbers = new ArrayList<>();

        // 整数を追加
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // 特定の値を確認（例：30）
        int target = 30;
        if (numbers.contains(target)) {
            System.out.println(target + " はリストに含まれています。");
        } else {
            System.out.println(target + " はリストに含まれていません。");
        }
        
        ArrayList<String> words = new ArrayList<>();

        // 文字列を追加
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("grape");

        // アルファベット順にソート
        Collections.sort(words);

        // ソート後の結果を表示
        System.out.println("アルファベット順に並べ替えたリスト:");
        for (String word : words) {
            System.out.println(word);
        }
		
        HashMap<String, String> capitalMap = new HashMap<>();

        // キーと値のペアを追加（国名と首都など）
        capitalMap.put("日本", "東京");
        capitalMap.put("アメリカ", "ワシントンD.C.");
        capitalMap.put("イギリス", "ロンドン");

        // 特定のキーの値を表示（例：「日本」）
        String key = "日本";
        String capital = capitalMap.get(key);

        System.out.println(key + " の首都は " + capital + " です。");
        
        HashSet<String> fru = new HashSet<>();

        // 要素を追加
        fru.add("りんご");
        fru.add("バナナ");
        fru.add("オレンジ");
        fru.add("バナナ"); // 重複は追加されない

        // セットのすべての要素を表示
        System.out.println("セットの内容:");
        for (String fruit : fru) {
            System.out.println(fruit);
        }
        HashMap<String, Integer> scoreMap = new HashMap<>();

        // データを追加（名前と点数など）
        scoreMap.put("田中", 85);
        scoreMap.put("佐藤", 90);
        scoreMap.put("鈴木", 78);

        // すべてのキーと値を表示
        System.out.println("名前と点数一覧:");
        for (String name : scoreMap.keySet()) {
            int score = scoreMap.get(name);
            System.out.println(name + " : " + score + "点");
        }
        

        int[] array = {1, 2, 3};
        List<Integer> list = new ArrayList<>();

        for (int num : array) {
            list.add(num); // 自動ボクシングされて Integer に変換される
        }

        // 表示
        System.out.println("int[] から変換した List<Integer>：");
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println(); // 改行

        // List<Integer> → Integer[]
        List<Integer> lists = Arrays.asList(1, 2, 3);
        Integer[] array2 = lists.toArray(new Integer[0]);

        // 表示
        System.out.println("List<Integer> から変換した Integer[]：");
        for (int n : array2) {
            System.out.print(n + " ");
        }
        System.out.println(); // 改行
        
        ArrayList <Integer>students = new ArrayList<>();
        
        students.add(75);
        students.add(60);
        students.add(45);
        students.add(100);
        students.add(85);
        
        int total = 0;
        int count = 0;
        for(Integer stu : students) {
        	total+=stu;
        	count ++;
        } 
        
        System.out.println("このクラスの平均的は"+total/count+"です");
        	
	}

}
