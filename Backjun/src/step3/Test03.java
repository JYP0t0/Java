package step3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
