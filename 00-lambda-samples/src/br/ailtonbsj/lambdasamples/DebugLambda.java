package br.ailtonbsj.lambdasamples;

import java.util.Arrays;
import java.util.List;

public class DebugLambda {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream().filter(n -> n % 2 == 0)
		.peek(n -> System.out.println("Peek is equivalent to tap on RxJS! " + n))
		.forEach(System.out::println);
		
		list.stream().filter(n -> n % 2 == 0)
		.map(n -> extractedForEasyDebug(n))
		.forEach(System.out::println);
	}

	private static StringBuilder extractedForEasyDebug(Integer n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		sb.append("s");
		sb.append("a");
		return sb;
	}

}
