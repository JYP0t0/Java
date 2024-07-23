package sub1;
/* 
 * 날짜: 2024/07/23
 * 이름: 박준영
 * 내용: 람다식 실습
 * spring 에서 많이 활용됨
 */
interface Person{
	public void hello(); // 람다식 추상 메서드 오직 하나
}

class Student implements Person{
	@Override
	public void hello() { // 리턴 X
		System.out.println("Hello Student!");
	}
}


// 람다식으로 정의할 인터페이스 선언 어노테이션

@FunctionalInterface
interface A{
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double a);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface M {
	public double func(double num);
}


public class LambdaTest {
	public static void main(String[] args) {
		
		// 객체지향 프로그래밍
		Person student = new Student();
		student.hello();
		
		// 함수형 프로그래밍(람다식)
		Person teacher = () -> {
			System.out.println("Hello Teacher!");
		}; 
		
		teacher.hello();
		
		
		// A interface 람다식 예제 
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		}; // 반환타입 int 매개변수 int 맞추기
		
		
		A a2 = (a, b) -> {
			return a + b;
		};
		
		
		A a3 = (a, b) -> a + b; // {} 중괄호 생략시 리턴
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		
		
		
		// B interface 람다식 예제 
		B b1 = (double a) -> {
			System.out.println("a: " + a);
		};
		
		
		B b2 = a -> System.out.println("a: " + a);
		
		
		B b3 = System.out::println;		// 메소드 참조연산자(::)
		
		
		b1.method(1.0);
		b1.method(2.0);
		b1.method(3.0);
		
		
		// C interface 람다식 예제 
		C c1 = () -> {return true;};
		C c2 = () -> false;
		
		System.out.println("c1: " + c1.method());
		System.out.println("c2: " + c2.method());
		
		
		// 람다식을 활용한 수학 클래스
		M m1 = Math::ceil;
		M m2 = Math::floor;
		M m3 = Math::round;
		
		System.out.println("올림값: " + m1.func(1.2));
		System.out.println("내림값: " + m2.func(1.2));
		System.out.println("반올림: " + m3.func(1.2));
	
	}
}
