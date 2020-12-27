package com.starwars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.json.JSONException;
import org.json.JSONObject;

public class SwApi {
	
	private Random randomNumber = new Random();
	
	private int randomId;
	
	public String url;
	
	private JSONObject swJson;
	
	public SwApi() {
		
		this.setRandomId(randomNumber.nextInt((83 - 1) + 1) + 1);
		
		this.url = "https://swapi.dev/api/people/" + randomId + "/";
		
		try {
			URL swapi = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) swapi.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

	        //TimeUnit.SECONDS.timedWait(conn, 3);
	        
	        if (conn.getResponseCode() == 200) {
	        	BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        	this.setSwJson(reader);
	        	reader.close();
	        }
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {}
	}


	public int getRandomId() {
		return randomId;
	}

	public void setRandomId(int randomId) {
		this.randomId = randomId;
	}
	
	public JSONObject getSwJson () {
		return swJson;
	}
	
	public void setSwJson (BufferedReader apiData) {
		try {
			this.swJson = new JSONObject(apiData.readLine());
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		};
	}

}
