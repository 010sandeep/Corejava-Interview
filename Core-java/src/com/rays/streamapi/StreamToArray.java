package com.rays.streamapi;

import java.util.stream.Stream;

public class StreamToArray {

	
	public static void main(String[] args) {
		
		
		Stream<String> stream = Stream.of("a", "c" , "b");
		
		String[] sa = stream.toArray(e -> new String[e]);
		
		System.out.println(sa[1]);
	}
}
