package day4.arraylist;

import java.util.*;

public class Example7 {

	// ArrayList of salaries (int)
	public static void main(String[] args) {
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		
		salariesList.add(15000);
		salariesList.add(16000);
		salariesList.add(10000);
		salariesList.add(5000);
		
		Collections.sort(salariesList); // for sorting in ascending order
		//Collections.sort(salariesList, Collections.reverseOrder()); // for sorting in descending order
		
		for(int x:salariesList) {
			System.out.println(x);
		}
		
		
	}
}
