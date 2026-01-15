package assignment12;

import java.util.ArrayList;

//check collection is empty
public class App12 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		System.out.println(num.isEmpty());
		num.remove(0);
		num.remove(0);
		System.out.println(num.isEmpty());
	}

}
