package jp.co.aforce.sample;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal mydog = new Dog(); 
		
		mydog.makeSound();
		mydog.sleep();
		
		Person p1 = new Student("のあ");
		p1.introduce();
		
		Movable m = new Car();
		Movable m1 = new Bicycle();
		
		m.move();
		m1.move();
		
		Animals b = new Bird();
		b.makeSound();
		Flyable b1 = new Bird();
		b1.fly();
	}

}
