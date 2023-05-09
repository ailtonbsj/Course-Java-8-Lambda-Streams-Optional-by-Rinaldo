package br.ailtonbsj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		// Collections
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().forEach(System.out::println);
		
		// Arrays
		int[] intArray = new int[] {1, 2, 3, 4};
		Arrays.stream(intArray).forEach(System.out::println);
		
		// IntStream.range
		IntStream.range(1, 5).forEach(System.out::println);
		
		// Stream.of
		Stream.of("This", "is", "a", "stream", "of", "strings")
			.forEach(System.out::println);
		
		// Stream.iterate
		Stream.iterate(2, n -> (int) Math.pow(n, 2))
			.limit(5)
			.forEach(System.out::println);
		
		// BufferedReader
		String url = "/tmp/file.txt";
		try {
			FileWriter fw = new FileWriter(url);
			fw.write("5\n6\n7\n8\n9\n10");
			fw.close();
			
			BufferedReader br = new BufferedReader(new FileReader(url));
			br.lines()
				.map(n -> Integer.valueOf(n))
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Files
		try {
			Path p = Paths.get("/usr/lib/jvm/");
			Files.list(p).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Random
		new Random().ints().limit(10).forEach(System.out::println);
		
		// Pattern regEx
		String s = "This is a sample of stream...";
		Pattern p = Pattern.compile(" ");
		p.splitAsStream(s).forEach(System.out::println);
	}

}
