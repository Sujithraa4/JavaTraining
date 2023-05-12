package com.javafundas;
//import java.util.*;
/**
 * Creating theatre details with constructor
 * @author ssampath
 * Date 27/04/2023
 */
class TheatreDet{
	private int theatreId;
	private String theatreName;
	private String location;
	private int halls;
	
	public TheatreDet() {
		theatreId=111;
		theatreName="Suji";
		location="Salem";
		halls=9;
	}
	public TheatreDet(int id,String theatreName,String location,int halls) {
		theatreId=id;
		this.theatreName=theatreName;
		this.location=location;
		this.halls=halls;
	}
	public void getTheatreDet() {
		System.out.println("Theatre ID: "+theatreId+"\nTheatre Name: "+theatreName+"\nLocation: "+location+"\nNo.of screens: "+halls);
	}
	
}
public class TheatreConstructor {
	public static void main(String args[]) {
		TheatreDet T=new TheatreDet();
		T.getTheatreDet();
		System.out.println("-------------------");
		TheatreDet t1=new TheatreDet(234,"Inox","Chennai",8);
		t1.getTheatreDet();
	}
}
