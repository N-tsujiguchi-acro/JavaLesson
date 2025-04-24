package sampleJava5;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if (args.length == 0) {
	            System.out.println("コマンドライン引数がありません。");
        } else {
            System.out.println("受け取ったコマンドライン引数:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        }
	}

}
