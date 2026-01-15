package assignment6;

import java.util.HashSet;

//Store unique element using hashset
public class App6 {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(3);
		num.add(4);
		System.out.println(num);
		
	}

}
