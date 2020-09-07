package List;

import java.util.ArrayList;
import java.util.List;

public class AddingAndDeletingValuesAtSomeIndex {

	public static void main(String[] args) {
		// List is created using ArrayList, LinkedList, Vector or Stack
		
		List<Integer> ls = new ArrayList<Integer>();
		
		ls.add(1);
		ls.add(3);
		ls.add(4);
		
		// Adding values at an index
		ls.add(1, 2);
		
		for(int x : ls)
			System.out.print(x + " ");
		
		// Getting value from a particular index
		System.out.println("\nValue at index 2 = " + ls.get(2));
		
		// Removing a value at index 3
		ls.remove(3);
		
		for(int x : ls)
			System.out.print(x + " ");
		
		
		
	}

}
