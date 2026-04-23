package com.rays.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	
	public static void main(String[] args) {
		
		String str[] = {"abc", "sdf", "ert", "saf"};
		
		Stream stream  = Arrays.stream(str);
		
		stream.sorted().forEach(System.out::println);
		
		
	}

}
