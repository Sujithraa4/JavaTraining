/**
 * 
 */
package com.String;
import java.util.*;
/**
 * Checking string methods
 * @author ssampath
 * Date 02/05/2023
 */
public class StringMethods {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s1=scan.nextLine();
		System.out.println("Length is: "+s1.length());
		
		String s2="  SSuu  ";
		String str4=s2.concat(s1);
		System.out.println("Concatinated string: "+str4);
		
		String str2=20+(30+"Suji")+70+100;
		System.out.println(str2);
		
		System.out.println(str4.substring(1));
		System.out.println(str4.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2.endsWith("SS"));
		System.out.println(s2.startsWith("SS"));
		String sr5="DiscovEr";
		System.out.println(sr5.startsWith("er"));
		String stri1=new String("Welcome");
		String stri2=new String("Welcome");
		String stri3="Welcome";
		String stri4="Welcome";
		System.out.println();
		System.out.println(stri1==stri2);
		System.out.println(stri3==stri4);
		scan.close();
	}

}
