package com.examples.arrays;

import java.util.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
		
		displayArray();
		System.out.println("\r");
		displayArrayList();
		
	}
	
	public static void displayArray() {
		String[] stringArray = new String[3];
		stringArray[0] = "Luke";
		stringArray[1] = "Han";
		stringArray[2] = "Yoda";
		
		System.out.println("Index 1: " + stringArray[1]);
		System.out.println("Length: " + stringArray.length);
		
		String[] tempArray = new String[stringArray.length - 1];
		int tempIndex = 0;
		
		for (String s : stringArray) {
			if (s.contains("Yoda")) {
				continue;
			}
			tempArray[tempIndex] = s;
			tempIndex++;
		}
		
		System.out.println("Length: " + tempArray.length);
	}
	
	public static void displayArrayList() {
		ArrayList<String> stringArray = new ArrayList<>();
		
		stringArray.add("Darth");
		stringArray.add("Boba");
		stringArray.add("Jabba");
		
		System.out.println("Index 2: " + stringArray.get(2));
		System.out.println("Length: " + stringArray.size());
		stringArray.remove(0);
		System.out.println("Length: " + stringArray.size());
	}
}
