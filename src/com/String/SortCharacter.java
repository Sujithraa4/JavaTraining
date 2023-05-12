package com.String;
import java.util.*;
/**
 * To find index of a character in a string
 * @author ssampath
 *
 */
public class SortCharacter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		for(char i:ch)
			System.out.print(i);
		scan.close();
	}

}