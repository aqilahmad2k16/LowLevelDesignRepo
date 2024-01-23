package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	public Map<String, StudentPrototype> map = new HashMap<>();
	
//	static {
//		map.put("intelligentStudnent", new IntelligentStudent());
//		map.put("student", new Student());
//	}
	
	public void register(String key, StudentPrototype student) {
		map.put(key, student);
	}
	
	public StudentPrototype getStudent(String key) {
		return map.get(key).clone();
	}

//	public void register(String key, Student student) {
//		// TODO Auto-generated method stub
//		map.put(key, student);
//	}
}
