package hashmap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import repository.Student;
import repository.StudentRespository;

public class CollectingToMapExample {
	
	public static void main(String[] args) {
		List<Student> students = new StudentRespository().getStudents();
		Map<String,List<String>> studentsHobbies = students.stream()
							.collect(Collectors.toMap(Student :: getName, Student :: getHobbies));
		System.out.println(studentsHobbies);
		
	}

}
