package sampleJava5_1;

public class Animal_1 {

    String name;
    String cry_method;

    public Animal_1(String name, String cry_method) {
        super();
        this.name = name;
        this.cry_method = cry_method;
    }

    public static void main(String[] args) {
        Animal_1 a1 = new Dogs("太郎", "わんわん"); 
        Dogs d1 = (Dogs) a1;  
        d1.showMessage();
    }

    // 静的クラスに変更
    static class Dogs extends Animal_1 {

        public Dogs(String name, String cry_method) {
            super(name, cry_method);
        }

        public void showMessage() {
            System.out.println(name + "は" + cry_method + "と鳴く");
        }
    }
}

