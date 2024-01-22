package Builder;

public class Client {
	public static void main(String[] args) {
//		BuilderClass builder = new BuilderClass();
		//one way to do this
//		builder.setAge(29);
//		builder.setGradeYear(2016);
//		builder.setName("Abdullah");
//		
//		Student student = builder.build();
		
		//other way to do this 
//		BuilderClass blder = Student.getBuilder();
//		Student student = blder
//						.setAge(29)
//						.setName("Abdullah")
//						.setGradeYear(2016)
//						.build();
		Student student = Student.getBuilder()
							.setAge(29)
							.setName("Abdullah")
							.setGradeYear(2016)
							.build();
		System.out.println("Student's Name is " + student.name + " of " + student.age + " in the grade year " + student.gradeYear);
	}
}
