package br.ailtonbsj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LearningCollect {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4);

		// Supplier, accumulator and combiner
		Set<Integer> collect = list.stream().collect(
				() -> new HashSet<>(),
				(l, e) -> l.add(e),
				(l1, l2) -> l1.addAll(l2)
			);
		System.out.println(collect);
		
		// to list
		List<Integer> collect2 = list.stream().collect(Collectors.toList());
		System.out.println(collect2);
		
		// to set
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		// to collection
		List<Integer> linked = list.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
		System.out.println(linked);
		
		// to string (join)
		String string = list.stream().map(i -> i.toString()).collect(Collectors.joining(","));
		System.out.println(string);
		
		// average
		Double average = list.stream().collect(Collectors.averagingDouble(i -> i.doubleValue()));
		System.out.println(average);
		
		// sum
		Integer sum = list.stream().collect(Collectors.summingInt(i -> i.intValue()));
		System.out.println(sum);
		
		// summarizing
		IntSummaryStatistics stat = list.stream().collect(Collectors.summarizingInt(i -> i.intValue()));
		System.out.println(stat.getAverage());
		System.out.println(stat.getCount());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getSum());
		
		// max, min, count
		list.stream().collect(Collectors.minBy(Comparator.naturalOrder()))
			.ifPresent(System.out::println);
		
		// groupingBy, partitionBy
		Map<Integer, List<Integer>> group = list.stream().distinct().collect(Collectors.groupingBy(n -> n % 3));
		System.out.println(group);
		
		// to map
		Map<Integer, Integer> map = list.stream().distinct().collect(Collectors.toMap(k -> k, v -> v * 2));
		System.out.println(map);
	}

}
