package br.ailtonbsj.lambdasamples;

import java.util.stream.IntStream;

public class WritingLambas {
	public static void main(String[] args) {
		// round bracket
		Runnable run = () -> System.out.println("Without args!");
		
		IntStream.range(0, 5)
			.filter((int n) -> n % 2 == 0)
			.reduce((int n1, int n2) -> n1 + n2)
			.ifPresent(System.out::println);
		
		// curly bracket
		IntStream.range(0, 5)
		.filter(n -> {
			System.out.println("Multiple lines!");
			return n % 2 == 0;
		})
		.forEach(System.out::println);
	}
}
