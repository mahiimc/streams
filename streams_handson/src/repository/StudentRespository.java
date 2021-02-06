package repository;

import java.util.Arrays;
import java.util.List;

public class StudentRespository {
	
	Student student1 = new Student(1,"abc",Arrays.asList("Hob1","Hob2","Hob3","Hob4"),1);
	Student student2 = new Student(2,"xyz",Arrays.asList("Hob6","Hob7","Hob8","Hob9"),0);
	Student student3 = new Student(3,"abcde",Arrays.asList("Hob1","Hob11","Hob12","Hob13"),5);
	Student student4 = new Student(4,"someexperson",Arrays.asList("Hob14","Hob15","Hob16","Hob17"),9);
	public List<Student> students = Arrays.asList(student1,student2,student3,student4);
	
	public  List<Student> getStudents(){
		return students;
	}
}
