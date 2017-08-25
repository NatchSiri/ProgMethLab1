package logic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Artist {
// START CODE HERE
	private String name;
	private String email;
	private char gender;
	private Date dob;
	
	public Artist(String name, String email, char gender, Date dob) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public Date getDob() {
		return dob;
	}


// END CODE HERE
//Hint:dateFormat.format(.....) to print date in the required format
}
