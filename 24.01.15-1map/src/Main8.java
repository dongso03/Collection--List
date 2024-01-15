import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
class Person{// 사람클래스만들고 맵안에 리스트넣고하면안되나?
	
}
//	Map<String, List<Person>> map =new HashMap<>();
public class Main8 {
	public static void main(String[] args) {
		
		Map<String, Object> person1 = new LinkedHashMap<>();
		person1.put("이름", "길동");
		person1.put("나이", 22);
		System.out.println(person1.toString());
		
		Map<String, Object> person2 = new LinkedHashMap<>();
		person2.put("이름", "둘리");
		person2.put("키", 180);
		person2.put("몸무게", 65);
		System.out.println(person2.toString());
	
		Map<String, Object> person3 = new HashMap<>(person2);
		System.out.println(person3);
		System.out.println(person2.equals(person3));
	}
}
