package br.ailtonbsj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LambdaOnCollections {

	public static void main(String[] args) {
		// List
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.removeIf(n -> n % 3 == 0);
		list.stream().forEach(System.out::println);
		list.replaceAll(n -> n * 2);
		list.stream().forEach(System.out::println);
		
		// Map
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "This");
		map.put(1, "is");
		map.put(2, "a");
		map.put(3, "Stream");
		
		map.compute(2, (k, v) -> v + " new");
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		
		map.merge(3, "!!!", (prev, curr) -> prev + curr);
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		
		map.replaceAll((k, v) -> v + "?");
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		
	}

}
