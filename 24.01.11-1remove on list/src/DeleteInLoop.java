import java.util.ArrayList;

public class DeleteInLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("dog");
		list.add("eagle");

		// 위 리스트에서 길이가 3인 문자열을 모두 삭제하긔
		//삭제가 발생하는경우의 인덱스 -1해주기(로직짜기 귀찮음)
		for (int i = 0; i < list.size(); i--) {
			String elem = list.get(i);
			System.out.println(elem);
			if (elem.length() == 3) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}
