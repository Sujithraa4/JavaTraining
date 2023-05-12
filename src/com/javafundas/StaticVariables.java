/**
 * 
 */
package com.javafundas;

/**
 * Static variables example
 * @author ssampath
 * Date 27/04/2023
 */
public class StaticVariables {
	private int theatreId;
	static String theatreName;
	static {
		theatreName="Inox";
	}
	public StaticVariables() {
		theatreId=2345;
	}
	public static void chngeId() {
		theatreName="ARRS";
	}
	public int getId(){
		return theatreId;
	}
	public static void main(String args[]) {
		StaticVariables S=new StaticVariables();
		System.out.println("Theatre Name: "+theatreName+"\nTheatre Id: "+S.getId());
		chngeId();
		System.out.println("Theatre Name: "+theatreName+"\nTheatre Id: "+S.getId());
	}
}
