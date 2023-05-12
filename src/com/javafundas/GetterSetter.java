/**
 * 
 */
package com.javafundas;

/**
 * Getter and setter methods
 * @author ssampath
 * Date 26/04/2023
 */
public class GetterSetter {
	private int theatreId;
	String theatreName;
	int theatreHalls;
	String theatreLocation;
	public void setTheatreDetails(int theatreId,String name,int halls,String location) {
		this.theatreId=theatreId;
		theatreName=name;
		theatreHalls=halls;
		theatreLocation=location;
	}
	void getTheatreDetails() {
		System.out.println("theatreId:"+theatreId);
		System.out.println("theatreName:"+theatreName);
		System.out.println("theatreHalls:"+theatreHalls);
		System.out.println("theatreLocation:"+theatreLocation);
	}
	public static void main(String[] args) {
		GetterSetter T=new GetterSetter();
		T.setTheatreDetails(4523, "INOX", 10, "Kochi");
		T.getTheatreDetails();
	}

}
