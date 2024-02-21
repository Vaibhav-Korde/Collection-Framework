package com.collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NewHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		Map<Integer,Long> map1 = new LinkedHashMap<>();
		
		map.put(null, "VAIBAHV");
		map.put(null, "Rushi");
		map.put(null, null);
	
		map.put(5, null);
		
		
		System.out.println(map);
		
	}
}