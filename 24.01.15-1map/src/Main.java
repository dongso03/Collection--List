import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "three");
		map.put(7, "Seven");
		map.put(11, "Eleven");
		map.put(3, "Another");
		map.put(77, "Another");
//		
//		System.out.println(map.size());
//		System.out.println(map.toString());
//		
//		System.out.println(map.get(11));
//		
		Set<Integer> keySet = map.keySet();

		for (Integer i : keySet) {
			System.out.println(i + "=" + map.get(i));
		}

		Iterator<Integer> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			Integer key = keyIter.next();
			System.out.println(key + "=" + map.get(key));
		}
	}
}
