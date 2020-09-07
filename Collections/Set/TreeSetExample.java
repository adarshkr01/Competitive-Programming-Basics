package Set;

import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		// Collections <- Set <- (TreeSet, HashSet, LinkedHashSet)
		Set<Integer> s = new TreeSet<Integer>();
		
		// TreeSet is used to maintain the sequence of values 
		
		
		// add() in set returns if a value was inserted or not as boolean
		// can be used to check for unique elements
		s.add(5);
		s.add(7);
		s.add(15);
		
		for(int x : s)
			System.out.println(x);
 
		
	}
}
