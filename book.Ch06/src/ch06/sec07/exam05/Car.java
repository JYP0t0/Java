package ch06.sec07.exam05;

// 클래스 선언 ( 클래스 멤버: 필드, 생성자, 메소드)
public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;


	// 생성자 선언
	Car(String model){
		// 23라인 생성자 호출
		this(model, "은색", 250);
	}

	Car(String model, String color){
		// 23라인 생성자 호출
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
