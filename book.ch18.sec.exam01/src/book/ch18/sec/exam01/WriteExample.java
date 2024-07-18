package book.ch18.sec.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		
		try { // 파일 생성 후 열기
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			// 파일 데이터 쓰기
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			
			os.close();
			System.out.println("저장 성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 예외 발생 추적
		} catch (IOException e) {
			System.out.println(e.getMessage()); // 예외 내용 출력
		}
	}
}
