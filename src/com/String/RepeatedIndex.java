package com.String;
import java.util.*;
/**
 * To find index of a repeated character in a string
 * @author ssampath
 *
 */
public class RepeatedIndex {
	public static void indexOfCharacter(String str,char arr[],char ch) {
		for(char i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
				System.out.println("The index of the character in the given sentence is "+str.indexOf(arr[i]));
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=scan.nextLine();
		String ch=scan.nextLine();
		char arr[]=str.toCharArray();
		
		
		if(str.contains(ch))
			indexOfCharacter(str,arr,ch);
		else
			System.out.println("The character is not in the given string.");
		scan.close();
	}

}