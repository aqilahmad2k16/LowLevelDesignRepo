package PrototypeAndRegistery;

public class Client {
	public static void main(String[] args) {
		// i want to get the object of circle and square which is already I have created and are there  in the prototype mmanager
//		ProtoTypeManager manager = new ProtoTypeManager();
		Shape shape = ProtoTypeManager.getShape("circle");
		shape.draw();
		
		//for square
		Shape shape2 = ProtoTypeManager.getShape("square");
		shape2.draw();
	}
}
