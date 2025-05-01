package jp.co.aforce.sample;

public class Throw {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
            int age = 15;
            if (age < 18) {
                throw new IllegalArgumentException("18歳未満は登録できません。");
            }
            System.out.println("登録が完了しました。");
        } catch (IllegalArgumentException e) {
            System.out.println("例外が発生しました: " + e.getMessage());
        } 


	}

}
