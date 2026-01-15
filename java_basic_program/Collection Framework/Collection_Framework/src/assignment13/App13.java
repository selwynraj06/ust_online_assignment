package assignment13;

import java.util.ArrayList;

//clear all element from collection
public class App13 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Cherry");
		fruits.add("Mango");
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);
	}

}
