package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>=1 && n<=9) {
			for(int x=1; x<=9; x++) {
				
				int y = n * x;
				System.out.println(n + " * " + x + " = " + y);
				sc.close();
			}
			
		}
	}
}
