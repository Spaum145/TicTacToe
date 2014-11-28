package model;

public class Player {
	private String name;
	public final Field marker;
	
	public Player(String name, Field marker) {
		this.name = name;
		this.marker = marker;
	}

	public String getName() {
		return name;
	}
}
