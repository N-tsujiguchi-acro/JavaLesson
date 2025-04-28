package Test;

public class Feild {
	
	int hp1 = 100;
	int hp2 = 100;
	
	

	public int showMethod(int a) {
		return hp2-=a;
	}


	public static void main(String[] args) {
		Feild f1 = new Feild();
		
		
		
		Feild f2 = new Feild();
		
		System.out.println("プレイヤー１は"+f1.hp1);
		System.out.println("プレイヤー２は"+ f2.showMethod(30));

	}

}
