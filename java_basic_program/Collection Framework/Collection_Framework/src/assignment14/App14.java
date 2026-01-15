package assignment14;

import java.util.ArrayList;

//Store Different data type using wrapper classes
public class App14 {

	public static void main(String[] args) {
		  ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        
	        System.out.println("Integer values stored in ArrayList:");
	        for (Integer num : numbers) {
	            System.out.println(num);
	        }
	}

}
