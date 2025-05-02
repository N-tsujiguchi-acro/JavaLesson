package javatest;

import java.util.HashSet;
import java.util.Set;

public class Ts {
	
	 public static void add(boolean a) {
		 
		 Set<String> set = new HashSet<String>();
		 set.add("TASK001");
		 set.add("TASK002");
		 set.add("TASK003");
		 set.add("TASK004");
		 if(a == true) {
			set.add("TASK005");
		 }
		 
		 int count = 0;
		 for(String sets : set) {
			 count++;
		 }
		 System.out.println(count);
		 
	 }
	 public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("TASK001");
		set.add("TASK002");
		set.add("TASK003");
		set.add("TASK001");
		set.add("TASK004");
		set.add("TASK002");
		System.out.println("処理済みのタスクID一覧:");
		for(String a : set) {
			System.out.print("_"+a);
		}
		
		System.out.println("");
		Set<String> set1 = new HashSet<String>();
		
		set1.add("TASK003");
		set1.add("TASK005");
		
		boolean lean = false;
		
		for(String b : set) {
			if(set1.contains(set)){
				System.out.println("タスクID TASK003 はすでに処理済みです");
			}else {
				System.out.println("タスクID TASK005 は未処理です");
				lean = true;
				add(lean);
				break;
				
			}
		}
		
	
		
	}
}
