/**
 * 
 */
package com.String;
import java.util.*;
/**
 * @author ssampath
 *
 */
public class SplitingWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}	
		scan.close();
	}

}
