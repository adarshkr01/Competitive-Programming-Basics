package Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapBasics {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		
		m.put("name", "Adarsh");
		m.put("uid", "balkfjs");
		m.put("degree", "BE");
		
		System.out.println(m); // Entire map is printed
		
		System.out.println(m.get("name")); // Getting a value according to key
		
		// We cannot add two values with same keys. The first value will be changed in that case
		System.out.println(m.get("uid"));
		m.put("uid", "18BCS6758");
		System.out.println(m.get("uid")); // previous UID will be replaced
		
		// Printing values of map using enhanced for loop using keySet()
		// keySet() returns a set, so, we need to store it in a set
		Set<String> s = new HashSet<String>();
		s = m.keySet();
		for(String key : s) {
			System.out.println(key + ": " + m.get(key));
		}
	}

}
