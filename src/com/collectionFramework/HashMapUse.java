package com.collectionFramework;

import java.util.HashMap;


public class HashMapUse {

	
	public static void main(String[] args)
	{
		
		HashMap<String, Integer> map = new HashMap<>();

		
		map.put(null, 10);
		map.put("vishal", 30);
		map.put("second", 20);

		
		System.out.println("Size of map is:- "
						+ map.size());

		
		System.out.println(map);

		
		if (map.containsKey("vishal")) {

			
			Integer a = map.get("vishal");

		
			System.out.println("value for key"
							+ " \"vishal\" is:- " + a);
		
		}
		
	}
}
