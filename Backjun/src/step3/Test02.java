package step3;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
	
		for(int d : arr) {
			System.out.println(d);
		}
	}
}
