package jp.co.aforce.sample;

public class Student extends Person {
	
	public Student(String name) {
        super(name);
    }
	
	void introduce() {
		
		
		System.out.println("私の名前は" + name );
	}
}
