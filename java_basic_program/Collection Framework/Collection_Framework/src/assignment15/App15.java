package assignment15;

import java.util.ArrayList;

public class App15 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Cherry");
		fruits.add("Mango");
		
		String [] arr = fruits.toArray(new String[0]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	        
	       
	}

}
