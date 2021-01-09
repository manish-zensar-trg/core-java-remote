package day5.setExamples;

import day3.classAttributes.Employee;
import java.util.*;

public class Example5 {

	// create a Set<Employee> which stores 4 Employee objects
	// and then display using for-each loop
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Derek");
		Employee employee2 = new Employee(1002, "John");
		Employee employee3 = new Employee(1003, "Peter");
		Employee employee4 = new Employee(1004, "Lisa");
		
		Set<Employee> setOfEmployees = new HashSet<Employee>();
		setOfEmployees.add(employee1);
		setOfEmployees.add(employee2);
		setOfEmployees.add(employee3);
		setOfEmployees.add(employee4);
		
		for(Employee employee:setOfEmployees) {
			System.out.println(employee);
		}
	}
}
