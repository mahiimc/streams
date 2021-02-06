package reduce;

import java.util.List;

import repository.Student;
import repository.StudentRespository;


public class ReduceExample {
	// Problem : sum of backlogs
	public static void main(String[] args) {
		List<Student> students = new StudentRespository().getStudents();
		int totalNumOfBacklogs = students.stream()
											.map(Student :: getNoOfBacklogs)
											.reduce(0,(x1,x2) -> x1+x2); 
		/**
		 * Initially  0
		 * 0+1
		 * 1+0
		 * 1+5
		 * 6+9
		 * Total No of Backlogs = 15
		 */
		System.out.println(totalNumOfBacklogs);  // Output : 15
		
	}
}
