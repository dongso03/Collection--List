import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
	public static void main(String[] args) {
		//FIFO: 선입선출
		Queue<String> queue = new LinkedList<>();
		queue.add("원소1");
		queue.offer("원소2");
		queue.add("원소3");
		queue.offer("원소4");
		
		System.out.println(queue);
		
		String r= queue.remove();
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}
}
