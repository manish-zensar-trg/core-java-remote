package day9.mcq;
// output??
public class Example11 {
	int a;
	int b;

	public void f() {
		a = 0;
		b = 0;
		int[] c = { 0 };
		g(b, c);
		System.out.println(a + " " + b + " " + c[0] + " ");
	}

	public void g(int b, int[] d) {
		a = 1;
		b = 1;
		d[0] = 1;
	}

	public static void main(String[] args) {
		Example11 obj = new Example11();

		obj.f();
	}
}
