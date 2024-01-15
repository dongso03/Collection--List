import java.util.Objects;

// 학원 수강생 관리 프로그램

// 영어반, 수학반

// 같은 과목에 중복 등록 불가.
// 각 반은 총원이 3명 (총원이 가득찬 경우, 해당 과목의 반이 신규 개설된다)

class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}

public class Mainteacher {
	public static void main(String[] args) {
		Student s1 = new Student("길동");
		Student s2 = new Student("도우너");
		Student s3 = new Student("둘리");
		Student s4 = new Student("길동");
		
		StudentManagement manage = new StudentManagement();
		
		manage.addEnglish(s1);
		manage.addEnglish(s2);
		manage.addEnglish(s3);
		manage.addEnglish(s4);
		
		
		manage.addEnglish(new Student("톰"));
		manage.addEnglish(new Student("브래드"));
		manage.addEnglish(new Student("레오나르도"));
		manage.addEnglish(new Student("레오나르도"));
		manage.addEnglish(new Student("길동"));
		
		manage.printEnglish();
	}
}

















