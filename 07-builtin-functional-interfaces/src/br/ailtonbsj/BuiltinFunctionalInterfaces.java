package br.ailtonbsj;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class BuiltinFunctionalInterfaces {

	public static void main(String[] args) {
		// Supplier: T get()
		// Consumer: void accept(T)
		// BiConsumer: void accept(T, U)
		Stream.generate(() -> new Random().nextInt())
			.limit(10)
			.forEach(System.out::println);
		
		// Predicate: boolean test(T)
		// BiPredicate: boolean test(T, U)
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		// Function: R apply(T)
		// BiFunction: R apply(T, U)
		list.stream()
			.map(n -> n * 2)
			.forEach(System.out::println);
		
		// UnaryOperator: T apply(T)
		// BinaryOperator: T apply(T, T)
		list.stream()
			.reduce((n1, n2) -> n1 + n2)
			.ifPresent(System.out::println);
	}

}
