/**
 * 
 */
package com.arrayassignment;
//import java.util.*;
/**
 * Generating random value while throwing a dice
 * @author ssampath
 * Date 26/04/2023
 */
public class DieRandom {
	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			//System.out.println(Math.random()*10);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
