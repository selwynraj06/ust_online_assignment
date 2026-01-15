package assignment8;

import java.util.HashMap;

//Basic key-value storage using hashMap
public class App8 {

	public static void main(String[] args) {
		HashMap<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(101, "Sam");
		emp.put(102, "Harish");
		emp.put(103, "Ram");
		emp.put(104, "Raju");
		
		for (Integer id : emp.keySet()) {
			System.out.println("Employee id: "+id+" Employee Name: "+emp.get(id));
		}
		
	}

}
