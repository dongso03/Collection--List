import java.util.HashMap;
import java.util.Map;

public class Main10 {
	public static void main(String[] args) {
		// 자판기 메뉴 가격 출력 프로그램 콜라 2000 사이다 1900 쥬수1800
		
		String input = "콜라";
		
		Map<String, Integer> map =new HashMap<String, Integer>();
		
		map.put("콜라", 2000);
		map.put("사이다", 1900);
		map.put("쥬스", 1800);
		map.put("핫식스", 1900);
	
		System.out.println(map.get(input));
	}
}
