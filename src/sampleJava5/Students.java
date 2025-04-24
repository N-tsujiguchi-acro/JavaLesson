package sampleJava5;

public class Students {

	String name;
    int[] scores;

    public Students(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    void showResult() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;

        System.out.println(name + " の合計点は " + total + " 点、平均点は " + (int)average + " 点");
    }

    public static void main(String[] args) {
        Students s1 = new Students("佐藤", new int[]{80, 90, 70});
        Students s2 = new Students("田中", new int[]{60, 75, 85});

        s1.showResult();
        s2.showResult();
    }

}
