package sub02;
/*
 * 날짜: 2024/07/16
 * 이름: 박준영
 * 내용: Stack, Queue 실습하기
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {
	public static void main(String[] args) {
		
		// 스택
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.print(stack.pop()+", ");
		}
		System.out.println();
		
		// 큐
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+", ");
		}
		
	}
}
