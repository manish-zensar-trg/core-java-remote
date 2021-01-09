package day5.abstraction.example2;

public class A implements Calculator, Maths {

	@Override
	public void add() {
		int sum = 3+5;
		
	}

	@Override
	public void subtract() {
		int result = 10-3;
		System.out.println(result);
		
	}

}
