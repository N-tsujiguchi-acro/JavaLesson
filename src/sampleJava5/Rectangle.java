package sampleJava5;

public class Rectangle {

	int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 8);
        System.out.println("面積は " + rect.getArea());
    }

}
