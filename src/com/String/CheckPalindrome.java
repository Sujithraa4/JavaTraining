package com.String;

import java.util.*;

/**

* Checking whether the given string is palindrome or not

* @author Sujithraa

* Date 03/05/2023

*/

public class CheckPalindrome {

public static StringBuffer rev(StringBuffer str) {

return(str.reverse());

}

public static void palindrome(StringBuffer str,String str1) {

if(new String(rev(str)).equals(str1))

System.out.println("Given string is palindrome");

else

System.out.println("Given string is not a palindrome");

}

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);

System.out.println("Enter the strings: ");

StringBuffer str=new StringBuffer(scan.nextLine());

String str1=new String(str);

palindrome(str,str1);

scan.close();

}

}