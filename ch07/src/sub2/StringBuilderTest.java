package sub2;
/*
 * 날짜: 2024/07/16
 * 이름: 박준영
 * 내용: 자바 StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// String 불변(immutable) 특성
		String str = "Java"; // 자바 주소 ( 본래 주소가 변하지 않음)
		System.out.println("str 주소: " + System.identityHashCode(str));
		
		str += "Programming"; // 자바에 프로그래밍을 더한 새 주소
		System.out.println("str 주소: " + System.identityHashCode(str));
		
		System.out.println("str: "+str);
		
		
		// String의 불변 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		
		System.out.println("sb 주소: " + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 주소: " + System.identityHashCode(sb));
		// 주소가 같음
		
		System.out.println("sb: "+sb);
	}
	
}
