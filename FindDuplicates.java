package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Karishma Anand
 * 
 * This Java program finds the duplicates in an integer array
 * and prints them
 */
public class FindDuplicates {

	public static void main(String[] args) {

		// Initialize Integer Array
		int[] numArray = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 5, 4, 1, 1, 0, 54, 23, 45, 21, 6, 54 };

		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		/* Iterate through the array and add to a HashMap.
		 * If the integer is not present in the HashMap, add to HashMap and set value as 1.
		 * Else increment the value.
		 */
		for (int i = 0; i < numArray.length; i++) {
			if (myMap.containsKey(numArray[i])) {
				myMap.put(numArray[i], myMap.get(numArray[i]) + 1);
			} else {
				myMap.put(numArray[i], 1);
			}
		}

		/* Iterate through the HashMap and check the value of each key.
		 * If the value is greater than 1, which means duplicates are present, print the key.
		 */
		for (Entry<Integer, Integer> item : myMap.entrySet()) {
			if (item.getValue() > 1) {
				System.out.println(item.getKey());
			}
		}
	}

}