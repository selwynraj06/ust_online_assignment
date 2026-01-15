package assignment7;

import java.util.HashSet;

//Display HashSet Element
public class App7 {

	public static void main(String[] args) {
		HashSet<String> colour = new HashSet<String>();
		colour.add("Red");
		colour.add("Blue");
		colour.add("Black");
		colour.add("Yellow");
		
		for (String data : colour) {
			System.out.println(data);
		}
	}

}
