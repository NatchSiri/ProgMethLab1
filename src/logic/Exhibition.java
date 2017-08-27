package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Exhibition {
        //START CODE HERE
	final int MAX_ART_WORK = 10;
	String name;
	ArtWork[] artworks = new ArtWork[MAX_ART_WORK];
	int numArtWorks;
	
	public Exhibition(String name) {
		this.name = name;
	}

	public void addArtWork(ArtWork artwork) {
		numArtWorks++;
		if (numArtWorks > MAX_ART_WORK) {
			System.out.println("ArtWork cannot add more");
		} else {
			this.artworks[numArtWorks] = artwork;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumArtWorks() {
		return numArtWorks;
	}
	
	public String toString() {
		String out;
		out = "Exhibition [name=" + name;
		out += ", artworks=" + Arrays.toString(artworks);
		return out;
	}
       //END CODE HERE
	public static void main(String[] args) throws ParseException {

       //TRY EXPERIMENT WITH YOUR CLASSES AND OBJECTS HERE
	}

}

