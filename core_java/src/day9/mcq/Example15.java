package day9.mcq;
//What is the value of variable z after executing the following code?
public class Example15 {
	public static void main(String[] args) {
		int x = 5;

		int y = 5;

		int z = 5;

		if (x > 3)

			if (y > 4)

				if (z > 5)

					z += 1;

				else

					z += 2;

			else

				z += 3;
		
		z += 4;
		
	}
}
