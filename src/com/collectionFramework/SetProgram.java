package com.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {

			Set<Integer> st = new HashSet<>();
			
			st.add(52);
			st.add(546);
			st.add(785);
			st.add(52);
			
			
			System.out.println(st);
			System.out.println(st.contains(786));
			
			
			Iterator<Integer> it = st.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
//			for(Integer a :st) {
//				System.out.println(a);
//			}
	}

}
