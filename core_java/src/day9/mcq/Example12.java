package day9.mcq;
// output??
public class Example12 {
public static void main(String[] args) {
	int[] arr = {1,1,2,3,0};
	for(int i=2; i<arr.length; i++) {
		arr[i] = arr[i-1] + arr[i-2];
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
