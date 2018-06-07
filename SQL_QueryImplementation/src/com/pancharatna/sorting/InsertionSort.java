package com.pancharatna.sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		
		List<Integer> l  = new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(6);
		l.add(9);
		l.add(3);

		sort(l);
		
		
	}
	
	public static void sort(List<Integer> a) {

		final List<Integer> sortedList = new LinkedList<>();
		originalList: for(Integer number : a) {
		for(int i=0; i<sortedList.size(); i++) {
			
				if(number < sortedList.get(i)) {
					sortedList.add(i,number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(),number);
		}
		
		for(Integer i : sortedList) {
			System.out.println(i);
		}
	}
	
}
