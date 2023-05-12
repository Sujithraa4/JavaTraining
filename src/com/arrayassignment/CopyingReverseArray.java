/**
 * 
 */
package com.arrayassignment;
import java.util.*;
/**
 * Copying array in reverse order
 * @author ssampath
 * Date 26/04./2023
 */
public class CopyingReverseArray {
	public static void main(String[] args) {
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		int j=0;
		for(int i=arr1.length-1;i>=0;i--) {
			arr2[j]=arr1[i];
			j++;
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		scan.close();
	}

}
