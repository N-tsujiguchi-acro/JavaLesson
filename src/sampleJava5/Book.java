package sampleJava5;

public class Book {
	String title;
	String author;
	int price;
	
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void showInfo() {
		 System.out.println("この本のタイトルは"+this.title+"です。　　著者は"+this.author+"で、価格は"+this.price+"です");
	}

	public static void main(String[] args) {
		Book b = new Book("吾輩は猫である", "夏目漱石", 1200);
        b.showInfo();// TODO 自動生成されたメソッド・スタブ
		
	}

}
