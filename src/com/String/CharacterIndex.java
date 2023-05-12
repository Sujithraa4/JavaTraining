package com.String;
import java.util.*;
/**
 * To find index of a character in a string
 * @author ssampath
 *
 */
public class CharacterIndex {
	public static int indexOfCharacter(String str,String ch) {
		return(str.indexOf(ch));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=scan.nextLine();
		String ch=scan.nextLine();
		int index=indexOfCharacter(str,ch);
		if(index>=0)
			System.out.println("The index of the character in the given sentence is "+index);
		else
			System.out.println("The character is not in the given string.");
		scan.close();
	}

}
