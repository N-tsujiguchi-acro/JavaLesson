package sampleJava5_1;

public class Car {
	
	String c_name = "名前を入力してください";
	int c_max = 300;
	int c_min = 0;
	

	public Car() {
		
	}
	

	public Car(String c_name, int c_max, int c_min) {
		super();
		this.c_name = c_name;
		this.c_max = c_max;
		this.c_min = c_min;
	}
	
	public void showMessage() {
		System.out.println(c_name + "のmaxスピードは" + c_max + "で最小スピードは" + c_min + "です");
	}

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("レクサス",500,200);
		
		c1.showMessage();
		c2.showMessage();
		
	}

}
