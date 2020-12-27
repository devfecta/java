package com.devfecta.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.*;

import com.starwars.SwApi;

public class ArrayExample {
	
	//static Random rand = new Random();
	
	//static String url;
	//public String characterName;
	SwApi swapi = new SwApi();
	
	public void displayArray() {
		String[] stringArray = new String[3];
		
		System.out.println("Name: " + swapi.getSwJson().getString("name"));
		
		stringArray[0] = swapi.getSwJson().getString("name");
		stringArray[1] = swapi.getSwJson().getString("name");
		swapi = new SwApi();
		stringArray[2] = swapi.getSwJson().getString("name");
		
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
	
	public void displayList() {
		List<SwApi> swApiArray = new ArrayList<>();
		
		swApiArray.add(swapi);
		swApiArray.add(swapi);
		swApiArray.add(swapi);
		
		System.out.println("displayList: " + swApiArray.get(0).getSwJson().getString("name"));
		System.out.println("displayList: " + swApiArray.get(1).getSwJson().getString("name"));
		System.out.println("displayList: " + swApiArray.get(2).getSwJson().getString("name"));
		System.out.println("displayList Size: " + swApiArray.size());
		
		for (SwApi c : swApiArray) {
			JSONObject character = c.getSwJson();
			System.out.println("displayList Loop: " + character.getString("name"));
		}
		

		/*
		System.out.println((String) stringArray.toString());
		stringArray.remove(0);
		System.out.println((String) stringArray.toString());
		stringArray.add("Leia");
		System.out.println((String) stringArray.toString());
		*/
	}
	
	public void displayArrayList() {
		List<SwApi> swApiArray = new ArrayList<>();
		
		swApiArray.add(swapi);
		swApiArray.add(new SwApi());
		swApiArray.add(swapi);
		
		System.out.println("displayArrayList: " + swApiArray.get(0).getSwJson().getString("name"));
		System.out.println("displayArrayList: " + swApiArray.get(1).getSwJson().getString("name"));
		System.out.println("displayArrayList: " + swApiArray.get(2).getSwJson().getString("name"));
		
		swApiArray.remove(1);
		System.out.println("displayArrayList 1 Removed");
		
		for (SwApi c : swApiArray) {
			JSONObject character = c.getSwJson();
			System.out.println("displayArrayList Loop: " + character.getString("name"));
		}
		System.out.println("displayArrayList Size: " + swApiArray.size());
	}
}