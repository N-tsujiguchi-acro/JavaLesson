package javatest;

import java.util.Arrays;
import java.util.List;

public class Book_Store {
	String name;
	String author;
	int sale_Num;
	int price;
	public Book_Store(String name, String author, int sale_Num, int price) {
		super();
		this.name = name;
		this.author = author;
		this.sale_Num = sale_Num;
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Book_Store> employees = Arrays.asList(
	            new Book_Store("「Python入門」", "山田太郎", 1200, 3000),
	            new Book_Store("「データ分析の基礎」", "鈴木花子", 1200, 3000),
	            new Book_Store("「AI技術最前線」", "佐藤一郎", 800, 4000),
	            new Book_Store("「Webデザイン講座」", "田中美咲", 2000, 2000),
	            new Book_Store("「はじめての機械学習」", "中村健一", 900, 3500)
	    );
		
		for(int book :Arrays.asList(employees) ) {
			
		}
		

	}

}
