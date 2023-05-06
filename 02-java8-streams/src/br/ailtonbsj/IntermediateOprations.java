package br.ailtonbsj;

import java.util.Arrays;
import java.util.List;

public class IntermediateOprations {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,1,3,5,6,7,8,9);
		
		// Using intermediate operations
		list.stream().skip(2).limit(5).distinct().forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		// Using map and filter
		list.stream().filter(i -> i % 2 != 0).map(i -> i * 2).forEach(i -> System.out.print(i + " "));
	}
}
