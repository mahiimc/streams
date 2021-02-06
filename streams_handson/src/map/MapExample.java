package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String[] args) {
		List<String> name = Arrays.asList("abc","abcd","abcde","abcdef");
		
		// Goal :-> transform(everyname) -> lowercase to uppercase
		// Map takes Function as Input  that Transforms data
		List<String> nameV2 = name.stream()
		.filter(n -> n.length() > 3)		
		.map(a -> a.toUpperCase())  // Map(Function(I){return R})
		.collect(Collectors.toList());
		System.out.println(nameV2);
	}

}
