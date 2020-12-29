package com.starwars;

public class Character {
	
	public String name;
	public String height;
	public String mass;
	public String hair_color;
	public String skin_color;
	public String eye_color;
	public String birth_year;
	public String gender;
	
	public Character(SwApi swapi) {
		this.name = swapi.getSwJson().getString("name");
		this.height = swapi.getSwJson().getString("height");
		this.mass = swapi.getSwJson().getString("mass");
		this.hair_color = swapi.getSwJson().getString("hair_color");
		this.skin_color = swapi.getSwJson().getString("skin_color");
		this.eye_color = swapi.getSwJson().getString("eye_color");
		this.birth_year = swapi.getSwJson().getString("birth_year");
		this.gender = swapi.getSwJson().getString("gender");
	}
	
}
