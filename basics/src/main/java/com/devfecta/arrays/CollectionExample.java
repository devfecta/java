package com.devfecta.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONObject;

//import com.starwars.SwApi;

import com.starwars.*;
import com.starwars.Character;

public class CollectionExample {
	
	public CollectionExample(SwApi swapi) {
		
		displayList(swapi);
		System.out.println("\r");
		displayArrayList(swapi);
		System.out.println("\r");
		displayLinkedList(swapi);
		System.out.println("\r");
		displayHashSet(swapi);
		System.out.println("\r");
		displayHashMap(swapi);
		
	}
	
	public void displayList(SwApi swapi) {
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
		
	}
	
	public void displayArrayList(SwApi swapi) {
		ArrayList<SwApi> swApiArray = new ArrayList<>();
		
		swApiArray.add(swapi);
		swApiArray.add(new SwApi());
		swApiArray.add(swapi);
		
		System.out.println("displayArrayList: " + swApiArray.get(0).getSwJson().getString("name"));
		System.out.println("displayArrayList: " + swApiArray.get(1).getSwJson().getString("name"));
		System.out.println("displayArrayList: " + swApiArray.get(2).getSwJson().getString("name"));
		System.out.println("displayArrayList Size: " + swApiArray.size());
		swApiArray.remove(1);
		System.out.println("displayArrayList 1 Removed");
		
		for (SwApi c : swApiArray) {
			JSONObject character = c.getSwJson();
			System.out.println("displayArrayList Loop: " + character.getString("name"));
		}
		System.out.println("displayArrayList Size: " + swApiArray.size());
	}
	
	public void displayLinkedList(SwApi swapi) {
		LinkedList<SwApi> swApiArray = new LinkedList<>();
		
		swApiArray.add(swapi);
		swApiArray.add(new SwApi());
		swApiArray.add(swapi);
		
		System.out.println("displayLinkedList: " + swApiArray.get(0).getSwJson().getString("name"));
		System.out.println("displayLinkedList: " + swApiArray.get(1).getSwJson().getString("name"));
		System.out.println("displayLinkedList: " + swApiArray.get(2).getSwJson().getString("name"));
		System.out.println("displayLinkedList Size: " + swApiArray.size());

		System.out.println("displayLinkedList: " + swApiArray.removeFirst().getSwJson().getString("name"));
		System.out.println("displayLinkedList 1 Removed");
		
		Iterator<SwApi> swApiIterator = swApiArray.iterator();
		
		while(swApiIterator.hasNext()) {
			System.out.println("displayLinkedList: " + swApiIterator.next().getSwJson().getString("name"));
		}
		
		System.out.println("displayLinkedList Size: " + swApiArray.size());
	}
	
	public void displayHashSet(SwApi swapi) {
		
		Character character = new Character(swapi);
		
		HashSet<Character> characters = new HashSet<>();
		
		characters.add(character);
		
		Iterator<Character> swApiIterator = characters.iterator();
		
		while (swApiIterator.hasNext()) {
			
			character = swApiIterator.next();
			
			System.out.println("displayHashSet: " 
					+ character.name 
					+ " - " + character.height 
					+ " - " + character.mass 
					+ " - " + character.hair_color 
					+ " - " + character.skin_color
					+ " - " + character.eye_color 
					+ " - " + character.birth_year 
					+ " - " + character.gender
			);
		}
		
	}
	
	public void displayHashMap(SwApi swapi) {
		
		
		
	}

}
