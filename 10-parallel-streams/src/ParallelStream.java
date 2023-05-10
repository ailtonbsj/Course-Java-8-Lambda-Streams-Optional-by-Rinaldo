import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.parallelStream().forEach(System.out::println);
		System.out.println("---");
		
		list.parallelStream().forEachOrdered(System.out::println);
		System.out.println("---");
		
		list.parallelStream().findAny()
			.ifPresent(System.out::println);
		list.stream().findAny()
			.ifPresent(System.out::println);
		System.out.println("---");
		
		list.parallelStream()
			.unordered()
			.skip(1).limit(2).forEach(System.out::println);
		System.out.println("---");
		
		Map<Integer, Boolean> collect = list.parallelStream()
			.collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0));
		System.out.println(collect);
		
		Map<Boolean, List<Integer>> collect2 = list.parallelStream()
				.collect(Collectors.groupingByConcurrent(n -> n % 2 == 0));
		System.out.println(collect2);
	}

}
