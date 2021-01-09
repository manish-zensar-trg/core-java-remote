package day3.classAttributes;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Updating values in employee object...");
		employee.setEmployeeId(60001);
		employee.setEmployeeName("John");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Creating object with parameterized constructor...");
		Employee employee2 = new Employee(5001, "David");
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getEmployeeName());
		
		System.out.println("**************************");
		System.out.println(employee2);
		

	}

}
