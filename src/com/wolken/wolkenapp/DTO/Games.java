package com.wolken.wolkenapp.DTO;

public class Games {
	String name;
	int noOfPlayers;
	String type;
	Double rating;
	
	
	
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Games(String name, int noOfPlayers) {
		this("offline");
		this.name=name;
		this.noOfPlayers=noOfPlayers;
		System.out.println();
	}
	public Games(String string) {
		// TODO Auto-generated constructor stub"
		this.type=string;
		System.out.println("one parameter constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
