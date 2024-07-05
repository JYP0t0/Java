package test1;
/*
 * 날짜 : 2024/07/03
 * 이름 : 박준영
 * 내용 : java 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		result = num++; // result에 num 대입 후 num 1증가
		System.out.println("result : " + result);
		
		result = ++num;//대입 전 num 1증가 후 result에 대입
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}

}
