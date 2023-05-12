/**
 * 
 */
package StringAssignment8;
import java.util.*;
/**
 * To perform string operations
 * @author Sujithraa
 * Date 04/05/2023
 */
public class TwoStringUpperCase{
	public static void upper(String str) {
		str.toUpperCase();
	}
	public static String concat(String str,String str1) {
		return(str.concat(str1));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String str1=scan.nextLine();
		System.out.println("Enter the String 2:");
		String str=scan.nextLine();
		upper(str);
		System.out.println(concat(str1,str));
		scan.close();
	}

}
