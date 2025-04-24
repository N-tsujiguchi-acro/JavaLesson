package sampleJava5;

public class Main5 {

	public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;  // ここで例外が発生する
            System.out.println("結果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("エラー: 0で割ることはできません！");
        }

       
    }
}
