package sub2;
/*
 * 날짜: 2024/07/22
 * 이름: 박준영
 * 내용: 스레드 상태 실습하기
 */
class Sub1Thread extends Thread{

	@Override
	public void run() { // 작업 스레드로 처리할 메서드
		for(int i=0; i<1000; i++) {
			System.out.println("Sub1 Thread 실행..;" + i);
			
			Thread.yield(); // 다른 스레드이게 실행 양보 (우선순위 밀림)
		}
	}
}

class Sub2Thread extends Thread{

	@Override
	public void run() { // 작업 스레드로 처리할 메서드
		for(int i=0; i<1000; i++) {
			System.out.println("Sub2 Thread 실행..;" + i);

		}
	}
}

public class ThreadYeildTest {

	public static void main(String[] args) {

		Sub1Thread sub1 = new Sub1Thread();
		Sub2Thread sub2 = new Sub2Thread();
		
		sub1.start();
		sub2.start();
		
		System.out.println("main 스레드 종료...");
		
		
		
	}
}














