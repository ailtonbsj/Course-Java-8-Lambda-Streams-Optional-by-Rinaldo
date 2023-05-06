package br.ailtonbsj.lambdasamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaInStreams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		// Listing without lambda
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			Integer item = (Integer) i.next();
			System.out.print(item + " ");
		}
		System.out.println();
		
		// Listing with lambda
		list.stream().forEach(item -> System.out.print(item + " "));
	}

}
