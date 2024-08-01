package Test01;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	// 업데이트 메서드
	public void updateScore(double newScore) {
		
		if(newScore <= 100.0) {
			this.score = newScore;
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수 입력");
		}
	}
	
	// 점수 getter 메서드
	public double getScore() {
		return score;
	}
	
	// 학생 정보 출력 메서드
	public void printStudentInfo() {
		System.out.println("학생 이름: " + studentName);
		System.out.println("학생 ID : " + studentId);
		System.out.println("과목명: " + subject);
		System.out.println("점수 출력: " + score);
	}
	
	
	
	

	


	

}
