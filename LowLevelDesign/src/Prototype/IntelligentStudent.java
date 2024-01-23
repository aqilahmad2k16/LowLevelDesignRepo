package Prototype;

public class IntelligentStudent implements StudentPrototype {
//	int iq;
//	
//	public IntelligentStudent() {
//		// TODO Auto-generated constructor stub
//	}
	
//	public IntelligentStudent(IntelligentStudent s) {
////		super(s);
//		this.iq = s.iq;
//	}
	@Override
	public void studentType() {
		System.out.println("intelligent student");
		
	}
	
	@Override
	public StudentPrototype clone() {
		return new IntelligentStudent();
	}
	

	
//	@Override
//	public void studentType() {
//		System.out.println("Intelligent student");
//	}
	
}
