/**
 * 
 */
package com.javafundas;

/**
 * Maximum in array using foreach
 * @author ssampath
 * Date 25/04/2023
 */
public class ArrayForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {125, 132, 95, 116, 110};
		int max=marks[0];
		for(int i:marks) {
			if (i>max){
				max=i;
			}
		}
		System.out.println("Maximum: "+max);
	}

}
