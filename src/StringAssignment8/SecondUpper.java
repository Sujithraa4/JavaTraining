package StringAssignment8;
import java.util.*;
/**
 * To print second word in uppercase
 * @author Sujithraa
 * Date 05/05/2023
 */
public class SecondUpper{
	public static String upper(String str) {
		return(str.toUpperCase());
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String str1=scan.nextLine();
		StringBuffer str2=new StringBuffer("Suji");
		str2.
		String arr[]=str1.split(" ");
		if(arr.length>1) {
			System.out.println(upper(arr[1])); 
		}else
			System.out.println("LESS");
		scan.close();
	}
}
