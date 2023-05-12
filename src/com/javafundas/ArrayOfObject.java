package com.javafundas;
import java.util.*;
/**
 * Creating theatre details with array of objects
 * @author ssampath
 * Date 27/04/2023
 */
class TheatreDetails{
	private int theatreId;
	private String theatreName;
	private String location;
	private int halls;
	public void setTheatreDetails(int id,String name,String Location,int halls) {
		theatreId=id;
		theatreName=name;
		location=Location;
		this.halls=halls;
	}
	public void getTheatreDetails() {
		System.out.println("Theatre ID: "+theatreId+"\nTheatre Name: "+theatreName+"\nLocation: "+location+"\nNo.of screens: "+halls);
	}
}
public class ArrayOfObject {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of theatres: ");
		int n=scan.nextInt();
		TheatreDetails T[]=new TheatreDetails[n];
		for(int i=0;i<n;i++) {
			T[i]=new TheatreDetails();
		}
		//Assigning
		for(int i=0;i<n;i++) {
			System.out.println("Enter theatre "+(i+1)+" details: ");
			System.out.print("Id: ");
			int id=scan.nextInt();
			System.out.print("Name: ");
			String name=scan.nextLine();
			scan.next();
			System.out.print("Location: ");
			String location=scan.nextLine();
			scan.next();
			System.out.print("Halls: ");
			int halls=scan.nextInt();
			T[i].setTheatreDetails(id, name, location, halls);
			System.out.println("---------------------------");
		}
		//printing
		for(int i=0;i<n;i++) {
			System.out.println("---Theatre "+(i+1)+" Details---");
			T[i].getTheatreDetails();
			System.out.println("---------------------------");
		}
		scan.close();
	}

}
