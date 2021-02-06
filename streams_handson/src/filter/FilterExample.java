package streams_handson.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	//simple Example with numbers
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// Filter Even nums from the Collection of Integers
	
		/**
		 * 1. Create Stream of nums
		 * 2. Apply Filter
		 * 3. Collect Filtered Items into a new List
		 */
		
		List<Integer> evenNums = nums.stream() //step1
		.filter(n -> n%2 == 0) //step2
		.collect(Collectors.toList()); //step 3
		@SuppressWarnings("unused")
		List<Integer> oddNums = nums.stream()
				.filter(n ->n%2 != 0)
				.collect(Collectors.toList());
		//oddNums.forEach(System.out::println);
		evenNums.forEach(System.out::println); // Method Reference
		
		
	}

}
