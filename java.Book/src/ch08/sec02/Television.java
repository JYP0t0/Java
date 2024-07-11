package ch08.sec02;

// RemoteControl 인터페이스로 Television을 사용할 수 있도록 Television 구현
public class Television implements RemoteControl {

	@Override  	// RemoteControl의 추상 메소드인 trunOn()을 재정의
	public void trunOn() {
		System.out.println("TV를 켭니다");
		
	}

}
