package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Exhibition {
        //START CODE HERE
	//final int MAX_ART_WORK;
	String name;
	Artwork[] artwork;
	int numArtWorks;
	
	public Exhibition(String name) {
		this.name = name;
	}

	public void addArtWork(Artwork artwork) {
		numArtWorks++;
		artwork[numArtWorks] = artwork;
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
	
       //END CODE HERE
	public static void main(String[] args) throws ParseException {

       //TRY EXPERIMENT WITH YOUR CLASSES AND OBJECTS HERE
	}

}

