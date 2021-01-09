package day9.mcq;

public class Example14 {
public static void main(String[] args) {
	int arr[] = {1,4,0,2,3,5};
	
	for(int k=0; k<5; k++) {
		arr[k] = arr[arr[k]];
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	System.out.println("******************");
	for(Integer i:arr) {
		System.out.println(i);
	}
	
}
}
