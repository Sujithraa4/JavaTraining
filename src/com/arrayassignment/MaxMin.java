/**
 * 
 */
package com.arrayassignment;
import java.util.*;
/**Finding minimum and maximum of array
 * @author ssampath
 * Date 26/04/2023
 */
public class MaxMin {
	public static int min(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return(min);
	}
	public static int max(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return(max);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int min=min(arr);
		int max=max(arr);
		System.out.println(max);
		System.out.println(min);
		scan.close();
	}

}
