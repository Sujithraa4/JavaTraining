/**
 * 
 */
package com.assignment;
import java.util.*;
/**
 * Display numbers with digits 2 greater
 * @author ssampath
 * Date 27/04/2023
 */
public class DigitsTwoGreater {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int fourDigit=scan.nextInt();
		int rev=0,n=0;
		while(fourDigit!=0) {
			int k=fourDigit%10;
			rev=(int)(rev*(Math.pow(10, n))+((k+2)%10));
			n++;
			fourDigit/=Math.pow(10,n);
		}
		System.out.println(rev);
		scan.close();
	}

}
