package com.devfecta.arrays;

import java.util.Arrays;

import com.starwars.SwApi;

public class ArrayExample {
	
	public ArrayExample(SwApi swapi) {
		
		displayArray(swapi);
		
	}
	
	public void displayArray(SwApi swapi) {
		
		String[] stringArray = new String[3];
		
		System.out.println("Name: " + swapi.getSwJson().getString("name"));
		
		stringArray[0] = swapi.getSwJson().getString("name");
		stringArray[1] = swapi.getSwJson().getString("name");
		swapi = new SwApi();
		stringArray[2] = swapi.getSwJson().getString("name");
		
		System.out.println("displayArray: " + Arrays.toString(stringArray));
		System.out.println("Length: " + stringArray.length);
		stringArray[1] = null;
		System.out.println("displayArray: " + Arrays.toString(stringArray));
		System.out.println("Length: " + stringArray.length);
		/*
		String[] tempArray = new String[stringArray.length - 1];
		int tempIndex = 0;
		
		for (String s : stringArray) {
			if (s.contains("Yoda")) {
				continue;
			}
			tempArray[tempIndex] = s;
			tempIndex++;
		}
		*/
		//System.out.println(Arrays.toString(tempArray));
		//System.out.println("Length: " + tempArray.length);
		
	}
	
	
}