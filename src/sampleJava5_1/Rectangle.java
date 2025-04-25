package sampleJava5_1;

public class Rectangle {

	private int width;
    private int height;

    // 幅と高さの両方を指定するコンストラクタ
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 幅だけを指定するコンストラクタ（正方形）
    public Rectangle(int width) {
        this.width = width;
        this.height = width; // 正方形として設定
    }

    public void printSize() {
        System.out.println("幅: " + width + ", 高さ: " + height);
    }

}
