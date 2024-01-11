import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("ds1");
		list.add("ds2");
		list.add("ds3");
		System.out.println(list.size());
		
		
		System.out.println(list.remove(0));
		System.out.println(list);
	}
}
