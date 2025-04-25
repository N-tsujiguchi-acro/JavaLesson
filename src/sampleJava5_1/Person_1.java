package sampleJava5_1;

public class Person_1 {
	
	
	public String toString(String a, int b) {

		return "名前："+ a +"年齢："+ b;

	}
	


	public static void main(String[] args) {
		
		Person_1 p = new Person_1();
		
		System.out.println(p.toString("のあ", 0));
		
		Person_2 p1 = new Person_2();
		
		System.out.println(p1.toString("ねこ", 10));

	}

}

class Person_2 extends Person_1{
	public String toString(String a, int b) {

		return "名前："+ a +"年齢："+ b;

	}
}