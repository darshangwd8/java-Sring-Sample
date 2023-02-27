package com.streams;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediates {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i =0; i<100;i++) {
			l.add(ThreadLocalRandom.current().nextInt(1,100));
		}
		Stream<Integer> s1= l.stream();
		Stream<Integer> hiNum = s1.filter(p->p>90);
		hiNum.forEach(p->System.out.println(p+"  "));
		System.out.println("*****************\n"+l);
		
		Stream<String> names = Stream.of("aBc","Hello","d","darshan");
		System.out.println(names.map(s->{
			return s.toUpperCase();
		}).collect(Collectors.toList()));
		
		
	}

}
