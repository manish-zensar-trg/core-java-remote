package day3.classAttributes;

import day3.beans.*;

public class TestStudent2 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Lisa", "BE");

		Student student2 = new Student(2, "Peter", "ME");

		Student student3 = new Student(3, "Patrick", "MBA");

		Student student4 = new Student(4, "Brad", "BBA");
		
		Student[] arrayOfStudents = {student1, student2, student3, student4};
		
		TestStudent2 testStudent2 = new TestStudent2();
		testStudent2.displayAllStudents(arrayOfStudents);
	}

	public void displayAllStudents(Student[] arrayOfStudents) {
		for(Student student:arrayOfStudents) {
			System.out.println(student);
		}
		
	}

}
