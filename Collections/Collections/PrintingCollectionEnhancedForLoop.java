package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class PrintingCollectionEnhancedForLoop {
	public static void main(String[] args) {
		// Collection is an Interface. So, we cannot create its object
		// Collection(Interface) <-- List(I)  <-- ArrayList(Class)
		// ArrayList implements List which extends Collection. So we can create an ArrayList object
		Collection<Integer> c = new ArrayList<Integer>();
		
		c.add(5);
		c.add(7);
		c.add(9);
		c.add(1);
		
		for(int x : c)
			System.out.println(x);
		
	}
}
