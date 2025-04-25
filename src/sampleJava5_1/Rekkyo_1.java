package sampleJava5_1;

public class Rekkyo_1 {
	public enum Day {
	    月曜日, 火曜日, 水曜日, 木曜日, 金曜日, 土曜日, 日曜日;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (Day day : Day.values()) {
            System.out.println(day);
        }
	}

}
