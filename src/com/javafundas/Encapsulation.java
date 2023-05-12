/**
 * 
 */
package com.javafundas;
import java.util.*;
/**
 * Encapsulation method in theatre details
 * @author ssampath
 * Date 27/04/2023
 */
class Encapsulation1{
	private int theatreId;
	private String theatreName;
	private String location;
	private int halls;
	public void setId(int theatreId) {this.theatreId=theatreId;}
	public void setName(String theatreName) {this.theatreName=theatreName;}
	public void setLocation(String location) {this.location=location;}
	public void sethalls(int halls) {this.halls=halls;}
	public int getId() {return theatreId;}
	public String getName() {return theatreName;}
	public String getLocation() {return location;}
	public int getHalls() {return halls;}
}
public class Encapsulation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Encapsulation1 E=new Encapsulation1();
		System.out.println("Enter Theatre Details:");
		System.out.println("Id:");
		int id=scan.nextInt();
		System.out.println("Name:");
		String Name=scan.next();
		System.out.println("Location:");
		String location=scan.next();
		System.out.println("Halls:");
		int halls=scan.nextInt();
		E.setId(id);
		E.setName(Name);
		E.setLocation(location);
		E.sethalls(halls);
		System.out.println("---Theatre Details---");
		System.out.println("Theatre Id: "+E.getId()+" | Theatre Name: "+E.getName()+" | Theatre Location: "+E.getLocation()+" | Theatre halls: |"+E.getHalls());
		System.out.println("-----------------");
		scan.close();
	}

}
