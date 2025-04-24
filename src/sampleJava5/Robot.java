package sampleJava5;

public class Robot {

	String action;

    void move() {
        System.out.println("ロボットは「" + action + "」しています。");
    }

    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.action = "歩いている";

        Robot r2 = new Robot();
        r2.action = "ジャンプしている";

        r1.move();  // → ロボットは「歩いている」しています。
        r2.move();  // → ロボットは「ジャンプしている」しています。
    }

}
