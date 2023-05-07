package br.ailtonbsj;

import java.util.Optional;
import java.util.OptionalInt;

public class UsingOptional {
	public static void main(String[] args) {
		Optional<Integer> number = parseToNumber("10");
		System.out.println(number.isPresent());
		System.out.println(number.isEmpty());
		System.out.println(number.orElse(0));
		System.out.println(number.orElseGet(() -> 5));
		number.ifPresent(n -> System.out.println(n));
		number.orElseThrow(() -> new NullPointerException("Valor nulo!"));
		System.out.println(number.get());
		
		OptionalInt integer = parseToPrimitiveInt("20");
		System.out.println(integer.getAsInt());
	}
	
	public static Optional<Integer> parseToNumber(String strNumber) {
		try {
			return Optional.of(Integer.valueOf(strNumber));
		} catch (Exception e) {
			return Optional.empty();
		}
	}
	
	public static OptionalInt parseToPrimitiveInt(String strNumber) {
		try {
			return OptionalInt.of(Integer.parseInt(strNumber));
		} catch (Exception e) {
			return OptionalInt.empty();
		}
	}
}
