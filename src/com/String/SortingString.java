package com.String;
import java.util.*;
/**
 * @author ssampath
 *
 */
public class SortingString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String arr[]=str.split(" ");

		 for(int i=0;i<arr.length;i++) {
		 	for(int j=i+1;j<arr.length;j++) {
				if((arr[i].compareTo(arr[j]))<0) {
					String temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
		for(String i:arr) {
			System.out.println(i+" ");
		}
		scan.close();
	}

}