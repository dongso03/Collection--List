import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentManagement {
	List<Set<Student>> allEnglish;
	List<Set<Student>> allMath;

	Set<Student> currentEnglish;
	Set<Student> currentMath;

	public StudentManagement() {
		currentEnglish = new HashSet<>();
		currentMath = new HashSet<>();

		allEnglish = new ArrayList<Set<Student>>();
		allEnglish.add(currentEnglish);

		allMath = new ArrayList<Set<Student>>();
		allMath.add(currentMath);

	}

	public void addEnglish(Student s) {
		if (containsEnglish(s)) {
			return;
		}
		createEnglish();
		currentEnglish.add(s);
	}

	public void printEnglish() {
		for (int i = 0; i < allEnglish.size(); i++) {
			System.out.println("영어" + (i + 1) + "반학생:" + allEnglish.get(i));
		}
	}

	private boolean containsEnglish(Student s) {
		for (Set<Student> set : allEnglish) {
			if (set.contains(s)) {
				return true;
			}
		}
		return false;
	}

	private void createEnglish() {
		if (currentEnglish.size() == 3) {
			Set<Student> created = new HashSet<>();
			allEnglish.add(created);
			currentEnglish = created;
		}
	}
}
