package sub03;

import java.util.LinkedList;

/*
 * 날짜: 2024/07/16
 * 이름: 박준영
 * 내용: LinkedList 실습하기
 */
public class LinkedListTest {
	public static void main(String[] args) {
		
		// LinkedList 생성
		LinkedList<String> cities = new LinkedList<>();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		
		System.out.println(cities);
		
		cities.add(1, "수원");
		System.out.println(cities);
		
		cities.addFirst("");
		System.out.println(cities);
		
		
		
	}
}
