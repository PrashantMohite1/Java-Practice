package javacollection.framework;

import java.util.*;

public class IteratorsPractice {
	
	static List<Integer> intlist = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		intlist.add(10);
		intlist.add(20);
		intlist.add(30);
		
		System.out.println(intlist);
		
		printlist(intlist);
		
		
		
	}
	
	static void printlist(List<Integer> names) {
		Iterator <Integer> sampleiterator= names.iterator();
		while (sampleiterator.hasNext()) {
			System.out.println("element :" + sampleiterator.next());
		}
		
		
		
		
	}

}
