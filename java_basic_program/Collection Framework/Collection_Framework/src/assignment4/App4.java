package assignment4;

import java.util.ArrayList;

//Iterate collection using for-each Loop
public class App4 {

	public static void main(String[] args) {
		ArrayList<String> course = new ArrayList<String>();
		course.add("CSE");
		course.add("IT");
		course.add("ECE");
		course.add("CSD");
		for (String data : course) {
			System.out.println(data);
		}
	}

}
