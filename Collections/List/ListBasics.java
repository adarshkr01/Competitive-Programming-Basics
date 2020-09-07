package List;

import java.util.*;
public class ListBasics {

	public static void main(String[] args) {
		// List is created using ArrayList, LinkedList, Vector or Stack
		
		List<Integer> ls = new ArrayList<Integer>();
		
		ls.add(1);
		ls.add(3);
		ls.add(4);
		
		for(int x : ls)
			System.out.print(x + " ");
		
		// Printing Size of List
		System.out.println("\nSize: " + ls.size());
	}

}
