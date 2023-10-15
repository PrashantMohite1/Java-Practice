package javacollection.framework;
import java.util.*;


public class ArrayListPractice {
	
	static ArrayList<String> listNames = new ArrayList<>();
	
	static ArrayList<Integer> listNumber = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("Prashant");
		listNames.add("chintu");
		listNames.add("vijay");
		
		listNumber.add(11);
		listNumber.add(12);
		listNumber.add(13);
		
		
		
//		System.out.println(listNames.get(0));
		
		listNames.remove(0);
		
		class2 newlist = new class2();
		newlist.displayList(listNames);
		
		
		newlist.displayNumber(listNumber);
	}
	

}


class class2{
	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
			
		}
	}
	void displayNumber(ArrayList<Integer> numberlist) {
		for (int name : numberlist) {
			System.out.println(name);
		}
	}

}

