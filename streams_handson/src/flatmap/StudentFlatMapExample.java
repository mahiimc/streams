package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import repository.Student;
import repository.StudentRespository;

public class StudentFlatMapExample {
	
	public static void main(String[] args) {
		List<Student> students = new StudentRespository().getStudents();
		List<String> hobbies = students.stream()
										.flatMap(stu -> stu.getHobbies().stream())
										.distinct() // removes duplicate data
										.filter(hob -> hob.length() > 4)
										.map(hob -> hob.toUpperCase())
										.collect(Collectors.toList()); // Collects  Hob1 only once
		System.out.println(hobbies);
	}

}
