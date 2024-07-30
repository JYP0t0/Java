package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 날짜:2024/07/29
 * 이름: 박준영
 * 내용: PreparedStatement 실습
 */
public class PreparedDeleteTest {
	
	public static void main(String[] args) {
		
		// DB 정보				 
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		
		// 아이디 J101 삭제하기
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체(PreParedStatement) 생성
			String sql = "Delete from `user2` where `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "J101");
			
			// 3단계 - SQL실행
			psmt.executeUpdate();
			// 4단계 - ResultSet 결과처리
			// 5단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
		
	}
}
