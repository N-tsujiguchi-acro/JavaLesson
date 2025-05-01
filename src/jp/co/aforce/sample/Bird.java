package jp.co.aforce.sample;

public class Bird implements Animals, Flyable {

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("分速１００M1でとぶ");
	}

	@Override
	public void makeSound() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ピーピーなく");
	}

}
