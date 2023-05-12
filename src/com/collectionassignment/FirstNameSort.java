/**
 * 
 */
package com.collectionassignment;
import java.util.*;
/**
 * Sort the names based on the first name
 * @author Sujithraa
 * Date 10/05/2023
 */
class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return firstName+" "+lastName;
	}
	@Override
	public int compareTo(Person o) {
		return(firstName.compareTo(o.firstName));
	}
	
}
public class FirstNameSort{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Person> arr=new ArrayList<Person> ();
		System.out.println("Enter the number of person:");
		int num=scan.nextInt();
		System.out.println("Enter the name of person:");
		for(int i=0;i<num;i++){
			arr.add(new Person(scan.next(),scan.next()));
		}
		Collections.sort(arr);
		System.out.println("The ordered list of the person:");
		Iterator<Person> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		scan.close();
	}

}

