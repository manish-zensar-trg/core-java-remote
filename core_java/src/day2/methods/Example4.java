package day2.methods;

// make methods as non-static
public class Example4 {

	public int add(int x, int y) {		
		int z = x+y;
		return z;
	}
	
	public int subtract(int x, int y) {
		int z = x-y;
		return z;
	}
	
	/*
	public static void main(String[] args) {
		Example4 example4 = new Example4();
		int result1 = example4.add(8, 5);
		int result2 = example4.subtract(27, 9);
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		
	} */
}
