package br.ailtonbsj;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class UsingReduce {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Optional<Integer> sum = list.stream().reduce((acc, val) -> acc + val);
		System.out.println(sum.get());
		
		String s = "This is a sample";
		List<String> string = Arrays.asList(s.split(" "));
		Optional<String> concat = string.stream().reduce((acc, val) -> acc.concat(", " + val));
		System.out.println(concat.get());
		
		// Using identity
		
		Integer product = list.stream().reduce(1, (acc, val) -> acc * val);
		System.out.println(product);
		
		double min = DoubleStream.of(1.5, 0.5, 3.0, 2.6)
			.reduce(Double.POSITIVE_INFINITY, (acc, val) -> Math.min(acc, val));
		System.out.println(min);
		
		// Using combination function
		Integer sumP = list.stream().parallel().reduce(0, (v1, v2) -> v1 + v2, (n1, n2) -> n1 + n2);
		System.out.println(sumP);
		
		// map + combiner
		String conc = list.stream().reduce("",
				(n1, n2) -> n1.toString() + n2.toString() + ", ",
				(n1, n2) -> "[" + n1 + n2 + "]");
		System.out.println(conc);
	}

}
