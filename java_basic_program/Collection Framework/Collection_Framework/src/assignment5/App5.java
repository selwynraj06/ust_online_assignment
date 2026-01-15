package assignment5;

import java.util.ArrayList;

//Check element Exist in list
public class App5 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Cherry");
		fruits.add("Mango");
		if(fruits.contains("Apple")) {
			System.out.println("Apple is Present");
		}
		else {
			System.out.println("Apple is not Present");
		}
		
	}

}
