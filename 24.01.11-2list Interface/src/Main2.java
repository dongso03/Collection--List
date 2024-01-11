import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("dnjsth1","dnjsth2","dnjsth3")
				);
		System.out.println(list);
		
		List<String>readable = Arrays.asList("dnjsth1","dnjsth2","dnjsth3");
		
		System.out.println(readable);
		
	//추가기능,제거기능이 없다 그래서 읽기전용으로 사용한다.	list.add("dnjsth4");
	}
}
