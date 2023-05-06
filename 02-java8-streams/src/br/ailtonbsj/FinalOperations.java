package br.ailtonbsj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FinalOperations {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,1,3,5,6,7,8,1,9);
		
		// Using final operations
		
		long pairsAmount = list.stream().filter(e -> e % 2 == 0).count();
		System.out.printf("Amount of pairs: %d\n", pairsAmount);
		
		Optional<Integer> min = list.stream().skip(4).min(Comparator.naturalOrder());
		System.out.printf("Smaller value: %d\n", min.get());
		
		List<Integer> pairs = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(pairs);
		
		Map<Integer, List<Integer>> group = list.stream().collect(Collectors.groupingBy(e -> e % 3));
		System.out.println(group);
		
		String join = list.stream().map(i -> String.valueOf(i)).collect(Collectors.joining(", "));
		System.out.println(join);
	}

}
