/**
 * 
 */
package com.javafundas;
import java.util.*;
/**
 * Two Dimension array
 * @author ssampath
 * Date 25/04/2023
 */
public class TwoDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		System.out.println("Instantiate");
		Scanner scan=new Scanner(System.in);
		int xx[][]=new int[3][3];
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
