package test5;
/*
 * 날짜: 2024/08/01
 * 이름: 박준영
 * 내용: 자바 총정리 연습문제
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
enum Gender {
	MALE, FEMALE
}

class Man {
	public void print() {
		System.out.println("남자 입니다.");
	}
}

class Woman {
	public void print() {
		System.out.println("여자 입니다.");
	}
}

public class Test09 {
	public static void main(String[] args) {
		
		Object human1 = makeHuman(Gender.MALE);
		Object human2 = makeHuman(Gender.FEMALE);
		
		if (human1 instanceof Man) { // instanceof 타입검사
			Man man = (Man) human1; // 다운 캐스팅
			man.print();
		}
		if (human2 instanceof Woman woman) {
			woman.print();
		}
	}
	public static Object makeHuman(Gender gender) { // 모든 클래스는 Object로부터 상속받음
		if (gender == Gender.MALE) {
			return new Man();
		} else if (gender == Gender.FEMALE) {
			return new Woman();
		}
		return null;
	}
}