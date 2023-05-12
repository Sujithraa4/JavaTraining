package com.collectionassignment;



		
	}

}
package com.collectionassignment; 
/**
 * HashSet basic read and write operations
 * @author Sujithraa
 * Date 10/05/2023
 */
import java.util.*; 


class Cricketer{ 

	private int jerNo; 

	private String name; 

//private String message; 

	public Cricketer(int jerNo, String name) { 

		this.jerNo = jerNo; 
	
		this.name = name; 
	
	} 
	
	public int getJerNo() { 
	
		return jerNo; 
	
	} 
	
	public void setJerNo(int jerNo) { 
	
		this.jerNo = jerNo; 
	
	} 
	
	public String getName() { 
	
		return name; 
	
	} 
	
	public void setName(String name) { 
	
		this.name = name; 
	
	} 
	
	@Override 
	
	public String toString() { 
	
		return "Cricketer [jerNo=" + jerNo + ", name=" + name + "]"; 
	
	}	 

} 

 

public class HashSetBasic {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("Enter the number of elements to be entered:"); 
		
		int num=scan.nextInt(); 
		
		 
		
		//Linked list using integer array items 
		
		LinkedList<Integer> lin1=new LinkedList<Integer>(); 
		
		System.out.println("Integer linkedlist: Enter int values..."); 
		
		for(int i=0;i<num;i++) 
		
			lin1.add(scan.nextInt()); 
		
		System.out.println("Integer linkedlist elements:\n"+lin1); 
		
		System.out.println(); 
		
		 
		
		//Linked list using double array items 
		
		LinkedList<Double> lin2=new LinkedList<Double>(); 
		
		System.out.println("Double Linkedlist: enter double values..."); 
		
		for(int i=0;i<num;i++) 
		
			lin2.add(scan.nextDouble()); 
		
		System.out.println("Double Linkedlist elements:\n"+lin2); 
		
		System.out.println(); 
		
		 
		
		//Linked list using String array items 
		
		LinkedList<String> lin3=new LinkedList<String>(); 
		
		System.out.println("String Linkedlist:enter strings..."); 
		
		for(int i=0;i<num;i++) 
		
			lin3.add(scan.next()); 
		
		System.out.println("String Linkedlist elements:\n"+lin3); 
		
		System.out.println(); 
		
		 
		
		//Linked list using character array items 
		
		LinkedList<Character> lin4=new LinkedList<Character>(); 
		
		System.out.println("Character Linkedlist: enter characters..."); 
		
		for(int i=0;i<num;i++) 
		
			lin4.add(scan.next().charAt(0)); 
		
		System.out.println("Character Linkedlist elements:\n"+lin4);		 
		
		System.out.println(); 
		
		 
		
		//Linked list using customised objects 
		
		LinkedList<Cricketer> lin=new LinkedList<Cricketer>(); 
		
		System.out.println("Customised Linkedlist: enter jerNo and name..."); 
		
		for(int i=0;i<3;i++) { 
		
			lin.add(new Cricketer(scan.nextInt(),scan.nextLine())); 
		
		} 
		
		System.out.println("Customised linkedlist elements:"); 
		
		Iterator<Cricketer> itr=lin.iterator(); 
		
		while(itr.hasNext()) { 
		
			System.out.println(itr.next()); 
		
		} 
		
		 
		
		scan.close(); 

	} 

} 