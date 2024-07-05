package ch02.sec03;

public class CharExample {
public static void main(String[] args) {
	char c1 = 'A';  // 문자 저장
	char c2 = 65;   // 유니코드 직접 저장
	
	char c3 = '가';  //문자 저장
	char c4 = 44032; // 유니코드 직접 저장
	
	char c = ' ';    // 작은따옴표 사이 공백 하나를 포함해 초기화 ( 단순 초기화 목적 )
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);

}
}
