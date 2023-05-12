package com.streamapi;

//import java.util;

import java.util.Arrays;

import java.util.Collection;

import java.util.stream.Stream;

public class StreamApis{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer [] numbers = new Integer[] {4,2,6,1,7,3,3,9};

		int count = (int) Arrays.stream(numbers).distinct().count();

		System.out.println("Count : "+ count);

		Stream<Integer> streamOfArray = Stream.of(numbers);

		streamOfArray.forEach(s->System.out.println(s+"\t"));



 //collection stream

			Collection<String> collection = Arrays.asList("Ather","Race","Sport");

			Stream<String> streamOfCollection = collection.stream();

			streamOfCollection.forEach(s->System.out.println(s+"\t"));

//Infinite Stream
				
			Stream<String> streamGenerated = Stream.generate(() -> "element").limit(3);

			streamGenerated.forEach(s -> System.out.println("\n"+s+"\t"));

			Stream<Integer> streamIterated = Stream.iterate(10, n->n+2).limit(5);

			streamIterated.forEach(s ->System.out.println("\n"+s+"\t"));

        }

}