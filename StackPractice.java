package javacollection.framework;
import java.util.*;

public class StackPractice {
	
	static Stack <Integer> firststack = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firststack.push(10);
		firststack.push(20);
		firststack.push(30);
		firststack.push(40);
		
		System.out.println(firststack);
		
//		firststack.pop();
//		System.out.println("after pop method"+firststack);
//		
//		firststack.pop();
//		System.out.println("after second pop method"+firststack);
		
		firststack.remove(2);               // for removing specific index element from stack 
		System.out.println(firststack);
		
		if (firststack.isEmpty()){
			System.out.println("stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		

	}
	
	

}
