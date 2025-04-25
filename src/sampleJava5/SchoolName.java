package sampleJava5;

public class SchoolName {
	
	String name;
	int[] scores;
	
	public SchoolName(String name, int[] scores) {
		super();
		this.name = name;
		this.scores = scores;
	}
	
	public void showAverage() {
		int sum = 0;
		int count =0; 
		for(int score : scores) {
			sum+=score;
			count++;
		}
		System.out.println("名前："+ this.name+"平均成績："+sum/count);
		
		
	}
	public static void main(String[] args) {
		
		 int[] scores = {80, 90, 70, 85};
	     SchoolName s = new SchoolName("田中太郎", scores);
	     s.showAverage();
	}
	
	

}
