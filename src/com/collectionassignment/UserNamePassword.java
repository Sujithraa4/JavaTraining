/**
 * 
 */
package com.collectionassignment;
import java.util.*;
/**
 * @author ssampath
 *
 */
public class UserNamePassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashMap<String,Integer> data1=new HashMap<String,Integer>();
		HashMap<String,Integer> data2=new HashMap<String,Integer>();
		for(int i=0;i<5;i++) {
			data1.put(scan.next(), scan.nextInt());
		}
	}

}
