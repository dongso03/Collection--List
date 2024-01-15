import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

//학원 수강생 관리 프로그램

// 영어반, 수학반 두개의반이있다.

//같은 과목에 중복(이름) 등록 불가
//두 과목을 들을수는있다.
//각 반은 총원이 3명
//3명 넘어가면 새로운 반 개설
//새로운반은 영어,수학 각각의반이여야한다

class Students { 
	private String name;
	private String math;
	private String eng;

	public Students(String name) {
		super();
		this.name = name;
	}

	public Students(String name, String math, String eng) {
		super();
		this.name = name;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student name=" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eng, math, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Students))
			return false;
		Students other = (Students) obj;
		return Objects.equals(eng, other.eng) && Objects.equals(math, other.math) && Objects.equals(name, other.name);
	}

}

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Set<Students>> mathClasses = new ArrayList<>();
		List<Set<Students>> engClasses = new ArrayList<>();

		while (true) {
			System.out.println("이름 입력 (종료하려면 '종료' 입력)");
			String name = scan.nextLine();

			// 종료 조건
			if (name.equals("종료")) {
				showClassList("수학 반", mathClasses);
				showClassList("영어 반", engClasses);
				
				break;
			}

			System.out.println("과목 입력");
			String sub = scan.nextLine();

			if (sub.equals("수학")) {
				addStudent(mathClasses, name);
			} else if (sub.equals("영어")) {
				addStudent(engClasses, name);
			}

		
			if (mathClasses.isEmpty() || mathClasses.get(mathClasses.size() - 1).size() >= 3) {
				mathClasses.add(new HashSet<>());
			}

			if (engClasses.isEmpty() || engClasses.get(engClasses.size() - 1).size() >= 3) {
				engClasses.add(new HashSet<>());
			}
		}
	}

	private static void addStudent(List<Set<Students>> classes, String name) {
		// 새로운 반 추가 체크
		if (classes.isEmpty() || classes.get(classes.size() - 1).size() >= 3) {
			classes.add(new HashSet<>());
		}

		for (Set<Students> aClass : classes) {
			for (Students student : aClass) {
				if (student.getName().equals(name)) {
					System.out.println("이미 등록된 학생입니다.");
					return;
				}
			}
		}

		// 새로운 학생 추가
		Students newStudent = new Students(name, "", "");
		classes.get(classes.size() - 1).add(newStudent);
		System.out.println("학생이 등록되었습니다.");
	}

	private static void showClassList(String className, List<Set<Students>> classes) {
		System.out.println(className + " 리스트:");

		for (int i = 0; i < classes.size(); i++) {
			Set<Students> aClass = classes.get(i);
			System.out.println(className + " " + (i + 1) + "반:");

			for (Students student : aClass) {
				System.out.println(student);
			}
		}
		System.out.println();
	}
}