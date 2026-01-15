package assignment9;

import java.util.HashMap;
import java.util.Map;

//Display all keys and values from HashMap

public class App9 {

	public static void main(String[] args) {
		  HashMap<String, String> countries = new HashMap<>();

	        countries.put("IN", "India");
	        countries.put("US", "United States");
	        countries.put("JP", "Japan");

	        System.out.println("Country Codes and Names:");
	        for (Map.Entry<String, String> entry : countries.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	}

}
