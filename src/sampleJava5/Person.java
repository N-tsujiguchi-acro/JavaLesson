package sampleJava5;

public class Person {
	
	String name = "名無しのごんべさん";
	int age = 0;
	
	public Person() {
        // 初期値のまま
    }
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
    
	public String showMethod () {
		return this.name;
		
	} 
	
	public int showAge () {
		return this.age;
		
		
	} 
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person p = new Person("辻口乃亜",25);
		
		Person p1 = new Person();
		
		System.out.println(p.showMethod());
		System.out.println(p.showAge());
		System.out.println(p1.showMethod());
		System.out.println(p1.showAge());
	}
	
	

}
