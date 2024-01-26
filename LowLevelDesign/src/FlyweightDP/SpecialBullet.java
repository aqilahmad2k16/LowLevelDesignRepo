package FlyweightDP;

import java.util.HashMap;
import java.util.Map;

public class SpecialBullet implements Bullet{
	//extrinsic properties which might change for different bullet
	String colorString;
	String typeString;
	GenericBullet genericBullet;
	
	public SpecialBullet(String color, String type, GenericBullet genericBullet) {
		this.colorString = color;
		this.typeString = type;
		this.genericBullet = genericBullet;
	}
	
	@Override
	public String bulletType() {
		return "Special Bullet";
	}
	
	public void printDetails() {
		Map<String, Integer> mapIntType = new HashMap<>();
		Map<String, String> mapStringType = new HashMap<>();
		mapIntType.put("radius", genericBullet.radius);
		mapIntType.put("weight", genericBullet.weight);
		mapStringType.put("shape", genericBullet.shape);
		mapIntType.put("damage", genericBullet.damage);
		mapStringType.put("color", colorString);
		mapStringType.put("type", typeString);
		
		System.out.println("Bullet Details: ");
		for(String key : mapIntType.keySet()) {
			System.out.println(key + " : " + mapIntType.get(key));
		}
		
		for(String key : mapStringType.keySet()) {
			System.out.println(key + " : " + mapStringType.get(key));
		}
	}

}
