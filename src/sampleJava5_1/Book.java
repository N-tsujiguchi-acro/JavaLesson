package sampleJava5_1;

public class Book {
	
	String title;
	String author;
	int price = 0;
	
	
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}



	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void showMessage() {
		System.out.println(author +"さんの代表的な本のタイトルは" + title + "で価格は" + price + "です");
	}

	public static void main(String[] args) {
		
		Book b1 = new Book("赤毛のアン","モンゴメリ",1200);
		Book b2 = new Book("赤毛のアン","モンゴメリ");
		
		b1.showMessage();
        b2.showMessage();
		
		
	}

}
