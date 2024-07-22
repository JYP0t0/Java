package step3;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	// 정수 N

		for(int i=0; i<n/4; i++) {
			if(n%4==0) {
				System.out.print("long ");
			}
		}
		System.out.println("int");
		sc.close();
	}
}
