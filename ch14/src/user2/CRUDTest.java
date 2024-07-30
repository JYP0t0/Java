package user2;

import java.util.List;
import java.util.Scanner;

import user1.User1DAO;
import user1.User1VO;

public class CRUDTest {

		public static void main(String[] args) {
			
			System.out.println("------------------");
			System.out.println("user2 회원 관리 v1.0");
			System.out.println("------------------");

			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
				System.out.println("선택> ");
				
				int answer = sc.nextInt();
				
				if(answer == 0){
					break;
				}else if(answer == 1) {
					
					System.out.println("아이디 입력: ");
					String uid = sc.next();
					
					System.out.println("이름 입력: ");
					String name = sc.next();
					
					System.out.println("생년월일 입력: ");
					String birth= sc.next();
					
					System.out.println("주소 입력: ");
					String addr = sc.next();
					
					User2VO vo = new User2VO(uid, name, birth, addr);
					User2DAO dao = User2DAO.getInstance();
					dao.insertUser(vo);
					System.out.println("입력 완료...");
					
				}else if(answer == 2) {
					User2DAO dao = User2DAO.getInstance();
					List<User2VO> users = dao.selectUsers();
							
					for(User2VO user : users) {
						System.out.println(user);
					}
				}else if(answer == 3) {
					
					System.out.println("검색 아이디: ");
					String searchUid = sc.next();
					
					User2DAO dao = User2DAO.getInstance();
					User2VO user = dao.selectUser(searchUid);
					
					System.out.println(user);
					
				}else if(answer == 4) {
					
					User2VO user = new User2VO();
					
					System.out.println("수정 회원 아이디 입력: ");
					user.setUid(sc.next());
					
					System.out.println("수정 회원 이름 입력: ");
					user.setName(sc.next());
					
					System.out.println("수정 회원 생년월일 입력: ");
					user.setBirth(sc.next());
					
					System.out.println("수정 회원 주소 입력: ");
					user.setAddr(sc.next());
					
					int result = User2DAO.getInstance().updateUser(user);
				}
						
					
			}
		}
}
