import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
	private int hei;
	private int wei;

	public Person(int hei, int wei) {
		super();
		this.hei = hei;
		this.wei = wei;
	}

	public int getHei() {
		return hei;
	}

	public void setHei(int hei) {
		this.hei = hei;
	}

	public int getWei() {
		return wei;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}

	@Override
	public String toString() {
		return "Person [hei=" + hei + ", wei=" + wei + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hei;
		result = prime * result + wei;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (hei != other.hei)
			return false;
		if (wei != other.wei)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		return this.hei - o.hei;
	}

}

public class Main4 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(
				Arrays.asList(new Person(180, 80), new Person(170, 90), new Person(190, 85)));
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getWei()-o2.getWei();
			}
		});
		System.out.println(list);
		
		Person max = Collections.max(list);
		System.out.println(max);
	}
}
