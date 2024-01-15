import java.util.HashMap;
import java.util.Map;

public class Main6 {
	public static void main(String[] args) {
		String line = "Hello, I'm developer.";
		// 위문장에서 각문자가 몇개씩 있는지 집계해보세요
		Map<Character, Integer> map = new HashMap<>();

		for(int i = 0;i<line.length();i++) {
			char ch = line.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map);
	}
}
