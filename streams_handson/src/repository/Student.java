package flatmap;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private List<String> hobbies;
	public Student(int id, String name, List<String> hobbies) {
		this.id=id;
		this.name=name;
		this.hobbies=hobbies;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
}
