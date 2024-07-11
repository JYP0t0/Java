package ch08.sec02;

public class RemteControlExample {
	public static void main(String[] args) {
		
		// 인터페이스도 하나의 타입이므로 변수의 타입으로 사용가능 (참조타입)
		RemoteControl rc;	
		
		
		// 인터페이스 변수에 구현 객체(구현 객체의 번지) 대입  
		// RemoteControl rc = new Television(); - 변수 선언과 동시에 구현 객체 대입 
		rc = new Television();  
		
		
		// 인터페이스 변수에 구현객체가 대입되었다면 메소드 호출 가능
		rc.trunOn();
	}
}
