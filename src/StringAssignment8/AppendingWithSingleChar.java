package StringAssignment8;
import java.util.*;
/**
 * Appending two strings with no dupe
 * @author Sujithraa
 * Date 05/05/2023
 */
public class AppendingWithSingleChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String 1:");
		StringBuffer str1= new StringBuffer (scan.nextLine());
		System.out.println("Enter the String 2:");
		StringBuffer str2= new StringBuffer (scan.nextLine());
		
		if((str1.charAt(str1.length()-1))==(str2.charAt(0))) {
			str2.deleteCharAt(0);
		}
		System.out.println(new String(str1.append(str2)).toLowerCase());
		scan.close();
	}

}
