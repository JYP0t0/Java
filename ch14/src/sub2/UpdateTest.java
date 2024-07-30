package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* 날짜:2024/07/29
 * 이름: 박준영
 * 내용: Update 실습
 */
public class UpdateTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		
		
		try {
			// 1단계 - 데이처베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체 statement 생성
			Statement stmt = conn.createStatement();
			
			// 3단계 - SQL 실행
			String 	sql =  "Update `user1` set ";
			   		sql += "`hp`='010-1234-1111',";
			   		sql += "`age`=25 "; // 띄어쓰기 중요...
			   		sql += "where `uid`='J101'";
			stmt.executeUpdate(sql);
			// 4단계 - Resultest 결과처리(Select일 경우)
			
			// 5단계 - 접속 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
		
		
		
			   
		
		
		
	}
}
