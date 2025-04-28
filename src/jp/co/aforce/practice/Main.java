package jp.co.aforce.practice;

public class Main {

	public static void main(String[] args) {
        Animal a = new Cat();
        a.speak();


	}

}

class Animal {	
    void speak() {	
        System.out.println("Some sound");	
    }	
}	


class Cat extends Animal {
   // ここにコードを追加
	void speak() {	
        System.out.println("Meow!");	
    }	
}


