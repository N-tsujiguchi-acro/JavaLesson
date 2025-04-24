package sampleJava5;

public class Cat {

	  String name;

	    void meow() {
	        System.out.println(name + " が鳴いた！");
	    }

	    public static void main(String[] args) {
	        Cat myCat = new Cat();
	        myCat.name = "タマ";
	        myCat.meow();  // 出力：タマ が鳴いた！
	    }

}
