package assignment2;

import java.util.ArrayList;

//Add and remove elements from ArrayList
public class App2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println("Before removal");
		System.out.println(arr);
		arr.remove(2);
		System.out.println("After removal");
		System.out.println(arr);
	}

}
