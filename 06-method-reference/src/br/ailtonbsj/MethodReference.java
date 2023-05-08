package br.ailtonbsj;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// Static methods
		list.stream()
			.map(n -> multiplyPerTwo(n))
			.forEach(System.out::println);
		list.stream()
			.map(MethodReference::multiplyPerTwo)
			.forEach(System.out::println);
		
		// Constructors
		list.stream()
			.map(n -> new BigDecimal(n))
			.forEach(System.out::println);
		list.stream()
			.map(BigDecimal::new)
			.forEach(System.out::println);
		
		// Multiple instances
		list.stream()
			.map(n -> n.doubleValue())
			.forEach(System.out::println);
		list.stream()
			.map(Integer::doubleValue)
			.forEach(System.out::println);
		
		// Unique instance
		BigDecimal two = new BigDecimal(2);
		list.stream()
			.map(BigDecimal::new)
			.map(n -> two.multiply(n))
			.forEach(System.out::println);
		list.stream()
			.map(BigDecimal::new)
			.map(two::multiply)
			.forEach(System.out::println);
		
	}
	
	private static Integer multiplyPerTwo(Integer i) {
		return i * 2;
	}

}
