package step1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		// Scanner 객체 사용 후 sc.close(); 메소드를 입력하여 리소스 해제하기
		sc.close(); 
	}
}


