package sampleJava5_1;

public class Animal {
	
	public void makeSound() {
		System.out.println("動物の鳴き方");
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Dog a2 = new Dog();
		Cat a3 = new Cat();
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
	}
	
	

}

class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("わんわん");
	}
	
}

class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("ニャー");
	}
	
}