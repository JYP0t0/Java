package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		m = h*60+m+t;
		h = m/60;
		m = m%60; 


	}
}
