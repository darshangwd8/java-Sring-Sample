package com.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminals {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8);
		Optional<Integer> iopt = numbers.reduce((i,j)->{
			return i+j;
		});
		if(iopt.isPresent()) {
			System.out.println(iopt.get());
		}
		// Once pipeline used we cannot use it again
		Stream<Integer> numbers1 = Stream.of(1,2,3,4,5,6,7,8);
		System.out.println(numbers1.count());

	}

}
