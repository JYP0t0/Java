package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		int min = h*60+m+t; // 현 시각에 요리 시간을 더한 총 시간(분)
		int hour = (min/60)%24; // 총 시간(분)을 시간으로 변환 
		int minute = min%60; // 시간을 제외한 나머지 분
		
		System.out.println(hour + " " + minute);
		
		sc.close();

	}
}
