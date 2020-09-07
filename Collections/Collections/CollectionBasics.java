package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBasics {
	public static void main(String[] args) {
		// Collection is an Interface. So, we cannot create its object
		// Collection(Interface) <-- List(I)  <-- ArrayList(Class)
		// ArrayList implements List which extends Collection. So we can create an ArrayList object
		Collection<Integer> c = new ArrayList<Integer>();
		
		c.add(5);
		c.add(7);
		c.add(9);
		c.add(1);
		
		// The problem with Collection is that value cannot be added at specific index
		// This problem is solved using List
		
		Iterator itr = c.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
