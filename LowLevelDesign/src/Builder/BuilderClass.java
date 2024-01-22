package Builder;

public class BuilderClass {
	int id;
	String name;
	int age;
	double psp;
	int gradeYear;
	String universityName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public BuilderClass setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public BuilderClass setAge(int age) {
		this.age = age;
		return this;
	}
	public double getPsp() {
		return psp;
	}
	public BuilderClass setPsp(double psp) {
		this.psp = psp;
		return this;
	}
	public int getGradeYear() {
		return gradeYear;
	}
	public BuilderClass setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
		return this;
	}
	public String getUniversityName() {
		return universityName;
	}
	public BuilderClass setUniversityName(String universityName) {
		this.universityName = universityName;
		return this;
	}
	
	public Student build() {
		return new Student(this);
	}
}
