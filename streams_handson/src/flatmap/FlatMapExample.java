package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class FlatMapExample {
	
	public static void main(String[] args) {
		/**
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(4,3);
		List<Integer> list3 = Arrays.asList(6,5);
		
		// merging and sorting Collections of Numbers
		
		
		List<List<Integer>> nums = Arrays.asList(list1,list2,list3);
		List<Integer> sortedAndMerged = nums.stream().flatMap(x -> x.stream()).sorted().collect(Collectors.toList());
		System.out.println(sortedAndMerged);
		**/
		// Flattening the data from the complex collection
		 List<String> cricket = Arrays.asList("abc","abcd","xyz");
		 List<String> tennis = Arrays.asList("pqrs","ab","bca");
		 List<List<String>> allPlayers = Arrays.asList(cricket,tennis);
		 List<String> namesStartWithM = allPlayers.stream()
		 			.flatMap(player -> player.stream()) 
		 			.filter(player -> player.startsWith("a"))
		 			.filter(player -> player.length() > 3)
		 			.map(player -> player.toUpperCase())
		 			.collect(Collectors.toList());
		System.out.println(namesStartWithM);
		
		
	}

}
