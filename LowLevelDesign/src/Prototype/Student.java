package Prototype;

public class Student implements StudentPrototype {
//	private int age;
//	private String nameString;
//	private String batchString;
//	private double avgBatchPsp;
//	private double studentPsp;
//	
//	public Student() {
//	}
//	
//	public Student(Student s) {
//		this.age = s.age;
//		this.nameString = s.nameString;
//		this.batchString = s.batchString;
//		this.avgBatchPsp = s.avgBatchPsp;
//		this.studentPsp = s.studentPsp;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setNameString(String nameString) {
//		this.nameString = nameString;
//	}
//
//	public void setBatchString(String batchString) {
//		this.batchString = batchString;
//	}
//
//	public void setAvgBatchPsp(double avgBatchPsp) {
//		this.avgBatchPsp = avgBatchPsp;
//	}
//
//	public void setStudentPsp(double studentPsp) {
//		this.studentPsp = studentPsp;
//	}
	
	@Override
	public StudentPrototype clone() {
		return new Student();
	}
	
	@Override
	public void studentType() {
		System.out.println("yes");
	}
	
	
}
