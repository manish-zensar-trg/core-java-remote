package day3.scannerExample;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String userName = sc.nextLine();
		System.out.println("UserName:"+userName);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Age:"+age);
		
	}
}
