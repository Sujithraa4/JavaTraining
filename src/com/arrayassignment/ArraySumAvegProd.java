/**
 * 
 */
package com.arrayassignment;
import java.util.*;
/**
 * Calculation of array elements sum, product, average
 * @author ssampath
 * Date 26/04/2023
 */
public class ArraySumAvegProd {
	public static void arrCalc(int arr[]) {
		int sum=0;
		int product=1;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			product=product*arr[i];
		}
		float average=sum/arr.length;
		System.out.println(sum+", "+average+", "+product);
		
	}
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		arrCalc(arr);
		scan.close();
	}
}
