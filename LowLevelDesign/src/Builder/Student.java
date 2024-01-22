package Builder;

import java.time.format.DateTimeFormatterBuilder;

public class Student {
	int id;
	String name;
	int age;
	double psp;
	int gradeYear;
	String universityName;
	
//	public Student() {// this is a complex obeject (cons: reduce readibility, prone to error, difficult to extends
//		// TODO Auto-generated constructor stub
//	}
	
	public Student(BuilderClass builder) {
		this.age = builder.getAge();
		this.name = builder.getName();
		this.gradeYear = builder.getGradeYear();
	}

	
	public static BuilderClass getBuilder() {
		// TODO Auto-generated method stub
		return new BuilderClass();
	}
}
