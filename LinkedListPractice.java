package javacollection.framework;
import java.util.*;

public class LinkedListPractice {
	
	static LinkedList<String> firstlink = new LinkedList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstlink.add("balu");
		firstlink.add("Prashant");
		firstlink.add("sarita");
		firstlink.add("Rutuja");
		
		System.out.println(firstlink);
		
//		print first element of string
		System.out.println(firstlink.getFirst());  
		
		System.out.println(firstlink.getLast());
		
		
		firstlink.set(0, "vijay");
		System.out.println("after modification : "+firstlink);
		
		firstlink.add("samantha");
		System.out.println("after adding sam"+firstlink);

	}

}


