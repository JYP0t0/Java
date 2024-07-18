package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferTest {
	public static void main(String[] args) {

		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";


		try {
			// 입력스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target); // 파일 복사

			
			// 버퍼로 이용한 byte 배열
			byte[] buffer = new byte[1024]; // 1KB
			
			// 파일 복사
			fis.transferTo(fos);
			

			// 스트림 해제
			

			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
