package sub01;
/*
 * 날짜: 2024/07/16
 * 이름: 박준영
 * 내용: Generic 실습하기
 * 
 * 제네릭(Generic)
 * - 클래스 내부 속성 타입을 동적으로 일반화 시키는 문법
 * - 제네릭 문법으로 클래스를 범용성있게 사용
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("일본",3000);
		
		
		// 제네릭 클래스 생성할 떄 치환변수 타입 선언
		FruitBox<Apple> box1 = new FruitBox<>(); // 뒤에는 <> 안 생략 가능
		box1.setFruit(apple);
		System.out.println(box1.getFruit());
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		System.out.println(box2.getFruit());
		
	}
}
