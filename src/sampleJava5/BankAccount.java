package sampleJava5;

public class BankAccount {
	int id;
    String bankName;
    int remain = 0;

    public BankAccount(int id, String bankName, int remain) {
        this.id = id;
        this.bankName = bankName;
        this.remain = remain;
    }

    // 入金処理
    public void deposit(int amount) {
        remain += amount;
        System.out.println("口座番号" + id + "の" + bankName + "様。");
        System.out.println("現在の残高は、" + amount + "円入金されて" + remain + "円です。");
    }

    // 引き出し処理
    public void withdraw(int amount) {
        if (remain >= amount) {
            remain -= amount;
            System.out.println(amount + "円を引き出しました。残高は" + remain + "円です。");
        } else {
            System.out.println("残高不足です。引き出しできません。現在の残高：" + remain + "円");
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, "山田太郎", 50000);

        account.deposit(10000);    // 入金処理
        account.withdraw(20000);   // 引き出し処理
        account.withdraw(50000);   // 残高不足テスト
    }

}
