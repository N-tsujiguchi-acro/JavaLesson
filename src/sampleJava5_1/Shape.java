package sampleJava5_1;

public class Shape {

	interface Shape_1{
		void shape(String name);
	}
	
	class Circle implements Shape_1{
		public void shape(String name) {
			System.out.println("形は"+ name);
		}
	}
	
	class Squire implements Shape_1{
		public void shape(String name) {
			System.out.println("形は"+ name);
		}
	}
	
	 public static void main(String[] args) {
	        Shape outer = new Shape();

 	        Shape_1 a1 = outer.new Circle();
	        Shape_1 a2 = outer.new Squire();

	        a1.shape("丸");
	        a2.shape("四角");
	 }
	
	

}

