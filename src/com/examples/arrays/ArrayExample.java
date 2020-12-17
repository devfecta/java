package com.examples.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.json.*;

public class ArrayExample {
	
	static Random rand = new Random();
	
	static String url;
	
	
	
	public static void main(String[] args) {
		
		displayArray();
		System.out.println("\r");
		displayArrayList();
		System.out.println("\r");
		displayList();
		
	}
	
	public static void displayArray() {
		String[] stringArray = new String[3];
		
		int randomNumber = rand.nextInt((83 - 1) + 1) + 1;
		
		url = "https://swapi.dev/api/people/" + randomNumber + "/";
		try {
			URL swapi = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) swapi.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");
	        
	        if (conn.getResponseCode() == 200) {
	        	BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		        
	        	JSONObject jsonObject = new JSONObject(reader.readLine());
		        
				System.out.println(jsonObject.getString("name"));
	        }
	        
	        
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		stringArray[0] = "Luke";
		stringArray[1] = "Han";
		stringArray[2] = "Yoda";
		
		System.out.println(Arrays.toString(stringArray));
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
		
		System.out.println(Arrays.toString(tempArray));
		System.out.println("Length: " + tempArray.length);
	}
	
	public static void displayList() {
		List<String> stringArray = new ArrayList<>();
		
		stringArray.add("Chewbacca");
		stringArray.add("Wicket");
		stringArray.add("Leia");
		//stringArray.addAll("")
		
		System.out.println((String) stringArray.toString());
		stringArray.remove(0);
		System.out.println((String) stringArray.toString());
		stringArray.add("Leia");
		System.out.println((String) stringArray.toString());
	}
	
	public static void displayArrayList() {
		ArrayList<String> stringArray = new ArrayList<>();
		
		stringArray.add("Darth");
		stringArray.add("Boba");
		stringArray.add("Jabba");
		
		System.out.println((String) stringArray.toString());
		System.out.println("Length: " + stringArray.size());
		stringArray.remove(0);
		System.out.println((String) stringArray.toString());
		System.out.println("Length: " + stringArray.size());
	}
}
