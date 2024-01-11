import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> origin = new ArrayList<>(
				Arrays.asList(10,20,30,40)
				);
		
		List<Integer> target =new ArrayList<>(
				Arrays.asList(60,40,4,0,100)
				);
		
		Collections.copy(target, origin);
	
		System.out.println(target);
		
//		Collections.fill(target, 999);
//		System.out.println(target);
	
	Collections.swap(target, 0, 4);
	System.out.println(target);
	
	Collections.shuffle(target);
	System.out.println(target);
	
	List<Integer> nums = Collections.nCopies(5, 99);
	System.out.println(nums);
	
	//nums.add(355);>>할거면 어레이 리스트에 집어넣어서 사용
	List<Integer> empty = Collections.emptyList();
	System.out.println(empty);
	
	List<Integer> unmod = Collections.unmodifiableList(target);
	System.out.println(unmod);
	
	int count = Collections.frequency(target, 100);
	System.out.println(count);
	}
}
