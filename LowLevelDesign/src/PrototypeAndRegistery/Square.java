package PrototypeAndRegistery;

public class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing square");
	}
	
	@Override
	public Shape clone() {
		return new Square();
	}
}
