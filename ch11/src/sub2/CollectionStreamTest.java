package sub2;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* 
 * 날짜: 2024/07/23
 * 이름: 박준영
 * 내용: 컬렉션 스트림 실습
 */

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class CollectionStreamTest {
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		// 외부반복자를 이용한 출력
		for(int num : nums) {
			System.out.println(num + ", ");
		}

		Iterator<Integer> it = nums.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		
		
		// 내부반복자를 이용한 출력
		nums.stream().forEach((num) -> { 	// forEach 메서드에 람다식이 통으로 들어감
			System.out.print(num + ", ");
		});
		
		
		// Person 리스트 생성
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
		
		
		// 외부반복자를 이용한 출력
		for(Person person : people) {
			System.out.println(person);
		}
		
		
		// 내부반복자를 이용한 출력
		people.stream().forEach((person) -> {
			System.out.println(person);
		});
		
		
		people.stream().forEach(System.out::println);
		
		
		// HashMap 생성
		Map<String, Integer> scores = new HashMap<>();
		scores.put("김유신", 92);
		scores.put("김춘추", 90);
		scores.put("장보고", 82);
		scores.put("강감찬", 71);
		scores.put("이순신", 98);
		
		// 외부반복자를 이용한 출력
		for(String key : scores.keySet()) {
			System.out.println("Key: " + key +", value: " + scores.get(key));
		}
		
		// 내부반복자를 이용한 출력
		scores.keySet().stream().forEach((key) -> {
			System.out.println("Key: " + key +", value: " + scores.get(key));
		});
		
		scores.entrySet().stream().forEach((entry) -> {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			
		});
		
		
		
	}
}
