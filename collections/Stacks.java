package collections;

// Java program to demonstrate the
// working of a stack
import java.util.*;
public class Stacks {

	// Main Method
	public static void main(String args[])
	{
		Stacks<String> stack = new Stacks<String>();
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}


// Geeks For Geeks Geeks 
// Geeks For Geeks 
