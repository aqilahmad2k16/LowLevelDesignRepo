package PrototypeAndRegistery;

import java.util.HashMap;
import java.util.Map;

//import javax.naming.ldap.ManageReferralControl;

public class ProtoTypeManager {
	private static final Map<String, Shape> shapeRegistry = new HashMap<>();
	
	static {
		//here I am adding two template or in the other words, two object that we want to create it's clone so that next we don't 
		// need create it and we will have already create object. taking two sample
		shapeRegistry.put("circle", new Circle());
		shapeRegistry.put("square", new Square());
	}
	
	//create method that will return object as pr our need, which takes key and return clone that object
	public static Shape getShape(String key) {
		return shapeRegistry.get(key).clone();
	}
}
