package assignment1;

import java.util.ArrayList;

//Store and display Elements using ArrayList
public class App1 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Harish");
		arr.add("Nithish");
		arr.add("Sam");
		arr.add("Praveen");
		arr.add("Vijay");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
