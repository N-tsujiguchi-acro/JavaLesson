package jp.co.aforce.sample;

 abstract class Person {
	
	 String name;


	public Person(String name) {
		super();
		this.name = name;
	}
	
	abstract void introduce();

}
