package assignment10;

import java.util.HashMap;

// Remove Entry from HashMap
public class App10 {

	public static void main(String[] args) {
		HashMap<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(101, "Sam");
		emp.put(102, "Harish");
		emp.put(103, "Ram");
		emp.put(104, "Raju");
		System.out.println("Before Remove the entry");
		System.out.println(emp);
		emp.remove(103);
		System.out.println("After Remove the entry");
		System.out.println(emp);
	}

}
