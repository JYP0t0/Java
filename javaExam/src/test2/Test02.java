package test2;
/*
 * 날짜:2024/07/05
 * 이름:박준영
 * 내용: 자바 배열 촤대값 연습 문제
 */
public class Test02 {
	public static void main(String[] args) {
		
		int arr[] = {17, 92, 18, 33, 58, 7, 26, 100};
		
		int maxNum = arr[0];
		
		for (int i = 0; i < 8; i++) {
			
			if (maxNum < arr[i]) {
			 maxNum = arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰 수 : " + maxNum);
	}
}
