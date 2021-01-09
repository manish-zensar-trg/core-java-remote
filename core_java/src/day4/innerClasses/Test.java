package day4.innerClasses;

import day4.innerClasses.OuterClass.InnerClass;

public class Test {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass.x);
		
		InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass.y);
	}
}
