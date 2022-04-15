package com.personal.codeprep;

import java.util.HashMap;

/** 
 *  A map is a data structure that is a collection of key-value pairs.
 *  It is more of like look-up tables.
 *  I can use golf players and associate their golf scores as values.
 * @author sidhha5
 *
 */
public class Maps {

	
	public static void main(String args[]) {
		
		HashMap<String, Integer> empIDs = new HashMap<>();
		empIDs.put("John", 455667);
		empIDs.put("Carl", 334455);
		empIDs.put("Jerry", 440055);
		empIDs.put("Charlie", 556677);
		
		System.out.println(empIDs);
		System.out.println(empIDs.get("Carl"));
		System.out.println(empIDs.containsKey("Jerry"));
		
		System.out.println(empIDs.containsKey("George"));
		System.out.println(empIDs.containsKey("George"));
		System.out.println(empIDs.getOrDefault("George", 0000));
		
		empIDs.replace("John", 123456);
		//updates the key if that key is not already present
		//and Instead it adds that new key to the list.
		empIDs.putIfAbsent("Steve", 444);
		System.out.println(empIDs);
		
		

		
	}
}
