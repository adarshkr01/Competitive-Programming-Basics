package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		
		ls.add(5);
		ls.add(7);
		ls.add(1);
		ls.add(10);
		ls.add(2);
		ls.add(9);
		
		// Collections is a class. Note the 's' at the end
		// In place
		Collections.sort(ls);
		
		for(int x : ls)
			System.out.print(x + " ");
		
		
		// Reverse Sorting
		Collections.sort(ls);
		Collections.reverse(ls);
		System.out.println();
		for(int x : ls)
			System.out.print(x + " ");
	}
}
