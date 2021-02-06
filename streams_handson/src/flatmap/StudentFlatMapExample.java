package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFlatMapExample {
	
	public static void main(String[] args) {
		Student student1 = new Student(1,"abc",Arrays.asList("Hob1","Hob2","Hob3","Hob4"));
		Student student2 = new Student(2,"xyz",Arrays.asList("Hob6","Hob7","Hob8","Hob9"));
		Student student3 = new Student(3,"abcde",Arrays.asList("Hob1","Hob11","Hob12","Hob13"));
		Student student4 = new Student(4,"someexperson",Arrays.asList("Hob14","Hob15","Hob16","Hob17"));
		List<Student> students = Arrays.asList(student1,student2,student3,student4);
		List<String> hobbies = students.stream()
										.flatMap(stu -> stu.getHobbies().stream())
										.distinct() // removes duplicate data
										.filter(hob -> hob.length() > 4)
										.map(hob -> hob.toUpperCase())
										.collect(Collectors.toList()); // Collects  Hob1 only once
		System.out.println(hobbies);
	}

}
