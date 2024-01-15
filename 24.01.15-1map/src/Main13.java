import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main13 {
	public static void main(String[] args) {
		Map<String, LocalDate> map = new HashMap<String, LocalDate>();
		
		
		Map<LocalDate, List<String>> mapHoliday = new HashMap<LocalDate, List<String>>();
		mapHoliday.put(LocalDate.of(2024, 5, 5), Arrays.asList("어린이날"));
		Map<LocalDate, String> mapPromiss= new HashMap<LocalDate, String>();
		mapPromiss.put(LocalDate.of(2024, 5, 5), "길동이랑 약속");
		
		LocalDate aDay = LocalDate.of(2024, 5, 5);
		System.out.println(mapHoliday.get(aDay));
		System.out.println(mapPromiss.get(aDay));
		
	//	Map<LocalDate, List<List<String>>> mapHoliday1 = new HashMap<>();
	}
}
