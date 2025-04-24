package sampleJava5;

public class Employee {
	
	  int id;
	    String name;
	    double salary;

	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public void raiseSalary(double percent) {
	        double increasedAmount = salary * percent / 100;
	        salary += increasedAmount;
	        System.out.println("ID番号"+id+name + "さんの給料は " + percent + "% 上昇し、" +(int) salary + " 円になりました。");
	    }

	    public static void main(String[] args) {
	        // 社員情報の作成
	        Employee emp = new Employee(101, "山田太郎", 300000);

	        // 昇給処理
	        emp.raiseSalary(10);  // 10% 昇給
	    }

}
