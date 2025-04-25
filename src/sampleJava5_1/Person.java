package sampleJava5_1;

public class Person {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void showMessage() {
		System.out.println(name +"さんは、現在の年齢は" + age + "才です");
	}
	
	public static void main(String[] args) {
		
		Person p = new Person(25,"ノア");
		
		p.showMessage();
		
	}

}
