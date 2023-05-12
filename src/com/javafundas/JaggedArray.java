/**
 * 
 */
package com.javafundas;

import java.util.Scanner;

/**
 * Jagged Array
 * @author ssampath
 * Date 25/04/2023
 */
public class JaggedArray {
	public static void main(String[] args) {
		int book[][]=new int[4][];
		book[0]=new int[] {1,2,3};
		book[1]=new int[] {4,5};
		book[2]=new int[] {6};
		book[3]=new int[] {7,8,9,10};
		System.out.println("Initialisation output:");
		for(int i=0;i<book.length;i++) {
			for(int j=0;j<book[i].length;j++) {
				System.out.print(book[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("Instantiation output:");
		Scanner scan=new Scanner(System.in);
		int xx[][]=new int[3][];
		xx[0]=new int[2];
		xx[1]=new int[3];
		xx[2]=new int[1];
		for(int i=0;i<xx.length;i++) {
			for(int j=0;j<xx[i].length;j++) {
				xx[i][j]=scan.nextInt();
			}
		}
		System.out.println("printing");
		for(int i=0;i<xx.length;i++) {
			for(int j=0;j<xx[i].length;j++) {
				System.out.print(xx[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}
