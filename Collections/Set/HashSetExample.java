package Set;

import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		// Collections <- Set <- (TreeSet, HashSet, LinkedHashSet)
		Set<Integer> s = new HashSet<Integer>();
		
		// add() in set returns if a value was inserted or not as boolean
		// can be used to check for unique elements
		s.add(5);
		s.add(7);
		s.add(15);
		
		System.out.println(s.add(16)); // true
		System.out.println(s.add(15)); // false as 15 already exists
		
		// HashSet uses Hashing to store values
		// Thus, sequence of Values is not maintained
		for(int x : s)
			System.out.println(x);
		
		// So we use TreeSet to maintain the sequence  
		
	}
}
