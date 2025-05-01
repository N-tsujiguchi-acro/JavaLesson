package jp.co.aforce.sample;

interface A {
	default void message() {
		System.out.println("A インターフェースのメッセージ");
	}
}


interface B {
	default void message() {
		System.out.println("B インターフェースのメッセージ");
	}
}


public class C implements A, B {

		@Override
	public void message() {
		System.out.println("C クラスの独自メッセージ");

		
		A.super.message();
		B.super.message();
	}
	

	public static void main(String[] args) {
		C c = new C();
		c.message();
	}
}