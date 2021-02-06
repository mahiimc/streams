package repository;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private List<String> hobbies;
	private int noOfBacklogs;
	public Student(int id, String name, List<String> hobbies,int noOfBacklogs) {
		this.id=id;
		this.name=name;
		this.hobbies=hobbies;
		this.noOfBacklogs = noOfBacklogs;
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
	public int getNoOfBacklogs() {
		return noOfBacklogs;
	}
}
