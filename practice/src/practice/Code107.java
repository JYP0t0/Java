package practice;

class Data{
	int value;			// 인스턴스 변수
	static int count; 	// 정적변수 0->1
	
	// 일반 변수와 static으로 선언한 변수의 차이
	void print() {
		System.out.println("value: " + value++);	// 0 0
		System.out.println("count: " + count++);	// 0 1
	}
}


public class Code107 {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.print();
		d2.print();
		
	}

}
