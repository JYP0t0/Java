package user4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class UserDAO {

	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}


	
	private UserDAO() {}
	
	
	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	// CRUD 메서드
	public void insertUser(User1VO vo) {
		
		String sql = "INSERT INTO `user1` values (?,?,?,?,?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getHp());
			psmt.setInt(5, vo.getAge());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User1VO selectUser(String uid) {
		
		String sql = "select * from `user1` where `uid`=?";
		User1VO user = null;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			ResultSet rs = psmt.executeQuery();
			
			// 조회 결과가 1또는 0이기 떄문에 while 대신 if 문으로 next()
			if(rs.next()) {
				user = new User1VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAge(rs.getInt(5));
			}
			
			rs.close();
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<User1VO> selectUsers() {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int updateUser(User1VO vo) {
		
		String sql = "update `user1` set `name`=?, `birth`=?, `hp`=?, `age`=?, where `uid`=?";
		int result = 0;
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,  vo.getName());
			psmt.setString(2,  vo.getBirth());
			psmt.setString(3,  vo.getHp());
			psmt.setInt(4,  vo.getAge());
			psmt.setString(5,  vo.getUid());
			
			// sql이 적용되는 row 카운트
			result = psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void deleteUser(String uid) {
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}