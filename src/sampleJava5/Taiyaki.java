package sampleJava5;

public class Taiyaki {
		String filling;
		
		public void setFilling(String value) {
			filling = value;
		}
		
		public void showFilling() {
			System.out.println("このたい焼きの中身は" + filling + "です");
		}
	public static void main(String[] args) {
		
		Taiyaki t1 = new Taiyaki ();
		Taiyaki t2 = new Taiyaki ();
		
		t1.setFilling("クリーム");
		t2.setFilling("あんこ");
		
		t1.showFilling();
		t2.showFilling();

		
	}

}
