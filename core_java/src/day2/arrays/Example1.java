package day2.arrays;

// array of String values
public class Example1 {

	public static void main(String[] args) {
		String[] cars = {"BMW", "Volvo", "Honda", "Hyundai"};
		/*
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars.length);
		*/
		for(int i=0; i<cars.length; i++) {
			String car = cars[i];
			System.out.println(car);
		}
		
	}
}
