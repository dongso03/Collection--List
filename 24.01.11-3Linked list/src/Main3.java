import java.util.Deque;
import java.util.LinkedList;

public class Main3 {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.push("1");
		deque.add("2");
		deque.push("3");
		deque.add("4");
		
		System.out.println(deque.size());
		
		System.out.println(deque);
		
	}
}
