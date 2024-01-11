import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");

		String[] arr = list.toArray(new String[0]);
		System.out.println("배열 변환 확인"+ Arrays.toString(arr));
		
		List<String> vec = new Vector<>();
		vec.add("원소1");
		vec.add("원소2");
		vec.add("원소3");

		
		System.out.println(list.containsAll(vec));
		System.out.println(list.equals(vec)); 
		
		System.out.println(list.subList(1, 2));
		
		list.removeAll(vec);
		System.out.println(list.isEmpty());
		
	}
}
