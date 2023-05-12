/**
 * 
 */
package com.javafundas;

/**
 * Array Declaration and print length
 * @author ssampath
 * Date 25/04/2023
 */
public class ArrayDeclaration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary[]=new int[10];
		for(int i=0;i<5;i++) {
			salary[i]=i;
		}
		System.out.println(salary.length);
	}

}
