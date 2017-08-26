package logic;

import java.util.Arrays;

public class ArtWork {
//START CODE HERE
	private String name;
	private Artist[] artist;
	private String medium;
	private int year;
	private String id;
	private int price;
	
	public ArtWork(String name, Artist[] artist, String medium, int year, String id, int price) {
		this.name = name;
		this.artist = artist;
		this.medium = medium;
		this.year = year;
		this.id = id;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public Artist[] getArtist() {
		return artist;
	}
	public String getMedium() {
		return medium;
	}
	public int getYear() {
		return year;
	}
	public String getId() {
		return id;
	}
	
	//@Override;
	public String toString() {
		String out;
		out = "ArtWork [name=" + name;
		out += ", artists=" + Arrays.toString(artist);
		out += ", medium=" + medium;
		out += ", year=" + year + ", id=" + id;
		out += ", price=" + price;
		return out;
	}
//END CODE HERE
//Hint: use Arrays.toString to print array	
}
