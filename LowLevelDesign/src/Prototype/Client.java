package Prototype;

import java.security.PublicKey;

public class Client {
	
	public static void fillRegistry(StudentRegistry r) {
		Student student = new Student();
//		IntelligentStudent intelligentStudent = new IntelligentStudent();
//		student.setAge(29);
//		student.setBatchString("April 21");
//		r.register("apr21batch", student);
//		r.register("mar20batch", intelligentStudent);
//		r.register("apr21batch", new IntelligentStudent());
		r.map.put("apr21batch", new Student());
		r.map.put("mar20batch", new IntelligentStudent());
	}
	public static void main(String[] args) {
		
		StudentRegistry studentRegistry = new StudentRegistry();
		fillRegistry(studentRegistry);
		StudentPrototype student = studentRegistry.getStudent("apr21batch");
		student.studentType();
		
		StudentPrototype studentPrototype = studentRegistry.getStudent("mar20batch");
		studentPrototype.studentType();
		
	}
}
