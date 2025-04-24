package sampleJava4;

import java.util.HashMap;
import java.util.Map;

public class CountryCapital {

	public static void main(String[] args) {
		
		  Map<String, String> capitals = new HashMap<>();
	        capitals.put("日本", "東京");
	        capitals.put("アメリカ合衆国", "ワシントンD.C.");
	        capitals.put("フランス", "パリ");
	        capitals.put("中国", "北京");

	       
	        System.out.print("すべての国名と首都：");
	        for (String country : capitals.keySet()) {
	            String capital = capitals.get(country);
	            System.out.print(country + "（" + capital + "） ");
	        }
	      
            System.out.print("「日」を含む国とその首都：");
	        for (String country : capitals.keySet()) {
	            if (country.contains("日")) {
	                String capital = capitals.get(country);
	                System.out.print(country + "（" + capital + "） ");
	            }
	        }
	      
	}

}
