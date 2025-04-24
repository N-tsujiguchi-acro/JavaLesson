package sampleJava5;

public class Car {

	  String model;
	    int speed;

	    public static void main(String[] args) {
	        Car car1 = new Car();
	        car1.model = "トヨタ";
	        car1.speed = 120;

	        Car car2 = new Car();
	        car2.model = "ホンダ";
	        car2.speed = 110;

	        System.out.println(car1.model + " の速度は " + car1.speed + " km/h");
	        System.out.println(car2.model + " の速度は " + car2.speed + " km/h");
	    }

}
