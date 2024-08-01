package test5;
/*
 * 날짜: 2024/08/01
 * 이름: 박준영
 * 내용: 자바 총정리 연습문제
 */
public class Test01 {

	public static void main(String[] args) {
		char 	var1 = 'A';
		int 	var2 = var1;
		char 	var3 = 'B';
		int 	var4 = var1 + var3;
		String var5 = """ 			
						Hello World!
						Hello Korea!
						Hello Busan!
					  """;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println(var5);
		/*
		 * 문자 타입: char
		 * 단 하나의 문자만 저장
		 * 2byte
		 * char 타입의 리터럴은 작은 따옴표(' ')로 감싸서 표현
		 * 컴퓨처 내부에 저장될 땐 정수로 치환(아스키 코드)
		 */
		
		
		
		
		int a = 10;
		int b = 5;
		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);
		// &&: 선조건이 true일 때만 후조건을 실행하며 선조건이 false이면 후조건을 실행하지 않는다
		// ||: 선조건이 true이면 후조건을 실행하지 않으며 선조건이 false일 때만 후조건을 실행한다
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		
		System.out.println(a == b & test(1));
		System.out.println(a == b && test(2));
		
		System.out.println(b > 0 & (a / b > 0));
		System.out.println(b > 0 && (a / b > 0));
		}
	
		public static boolean test(int n) {
		System.out.println("test(" + n + ") 실행...");
		return true;
		}
}
