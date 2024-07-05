package test1;
/*
 * 날짜 : 2024/07/03
 * 이름 : 박준영
 * 내용 : java  연습문제
 */
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = scanner.nextInt();
		int grade = 0;
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		scanner.close();
		System.out.printf("등급은 %c입니다.", grade);
	
	}

}
