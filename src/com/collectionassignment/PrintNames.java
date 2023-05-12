/**
 * 
 */
package com.collectionassignment;
import java.util.*;
/**
 * @author ssampath
 *
 */
public class PrintNames {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many names: ");
		int n=scan.nextInt();
		System.out.println("\n");
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			arr.add(scan.nextLine());
		}
		for(String i:arr) {
			if(i.length()>5)
				System.out.println(i);
		}
		scan.close();
	}

}
