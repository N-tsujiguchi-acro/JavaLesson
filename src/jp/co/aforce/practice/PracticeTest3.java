package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PracticeTest3 {

	public static void main(String[] args) {
		//題１
		String str[] = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		//題２
		String s = "ボールペン";
		for(String strs : str) {
			if(strs == s) {
				System.out.println(strs);
			}
		}
		//題３
		Set<String> set = new HashSet<>();
		
		set.add("山田太郎");
		set.add("鈴木花子");
		set.add("佐藤二郎");
		set.add("山田太郎");
		set.add("髙橋三郎");
		//題５
		
		String str1 = "佐藤二郎";
		
		for(String st : set) {
			if(st == str1) {
				System.out.println(st);
			}
		}
		
		//題6
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				
		
		list1.addAll(list2);
		
		Collections.sort(list1);
		
		for(int a : list1) {
			System.out.println(a);
		}
		//題7
		ArrayList<Integer> list3 = new ArrayList<>();				
		list3.add(13);				
		list3.add(14);				
		list3.add(17);				
		list3.add(21);				
		
		for (int b : list3) {
            boolean added = false;
            for (int r : list1) {
                if (b > r) {
                    added = true;
                } else {
                    break;
                }
            }
            
            if (added) {
                list1.add(b);
            }
        }

  
        Collections.sort(list1);

        for (int a : list1) {
            System.out.print(a + ",");
        }
		
		
		
	}

}
