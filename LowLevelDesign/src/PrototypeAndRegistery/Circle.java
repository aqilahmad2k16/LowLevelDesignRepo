package PrototypeAndRegistery;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("drawing circle");
		
	}

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Circle();
	}

	
	
}
