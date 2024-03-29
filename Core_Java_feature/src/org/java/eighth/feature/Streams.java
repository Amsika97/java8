package org.java.eighth.feature;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 8, 60, 13, 80);

		Stream<Integer> data = numbers.stream();

		System.out.println("list are " + numbers);

//		data.forEach(n -> System.out.println("streams are " + n));

		// --------------------using count()------------ //

//		long size = data.count();
//		
//		System.out.println("number of elements: "+ size);

		// --------------------using map()------------ //

//		Stream<Integer> mappedData = data.map(n-> n*2);
//		
//		mappedData.forEach(n -> System.out.println("mapped data are " + n));

		// --------------------using filter()------------ //

//		Stream<Integer> filteredData = data.filter(n->n%2==0);
//		
//		filteredData.forEach(n->System.out.println("filtered data are " + n));

		// --------------------using collect()------------ //

//		List<Integer> CollectedData = data.filter(n->n%2==0).collect(Collectors.toList());
//		
//		System.out.println("Collected data are "+ CollectedData);

		// --------------------using default sorted()------------ //

//	List<Integer> sorteddata =	data.sorted().collect(Collectors.toList());
//	
//	System.out.println("default sorted data are "+ sorteddata);

		// --------------------using customised sorted()------------ //

//		List<Integer> sorteddata =	data.sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());

//		List<Integer> sorteddata =	data.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		
//		System.out.println("customised sorted data are "+ sorteddata);

		// --------------------using min()------------ //

//		Integer mindata = data.min((s1, s2) -> -s1.compareTo(s2)).get();
//
//		System.out.println("Maximum element is " + mindata);
		
		// --------------------using max()------------ //

//		Integer maxdata = data.max((s1, s2) -> -s1.compareTo(s2)).get();
//
//		System.out.println("Minimum elements is " + maxdata);
		
		// --------------------using toArray()------------ //
		
//		Integer[] arraydata = data.toArray(Integer[]::new);
//		
//		for(Integer i : arraydata) {
//		
//		System.out.println("using toarray() " + i);
//		}
		
		Object[] arraydata = data.toArray();
		
		for(Object i : arraydata) {
		
		System.out.println("using toarray() " + i);
		}

	}

}
