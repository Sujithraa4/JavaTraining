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
public class TwoStringOperation {
	public static void rev(StringBuffer str) {
		str.reverse();
	}
	public static StringBuffer concat(StringBuffer str,StringBuffer str1) {
		return(str.append(str1));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String 1:");
		StringBuffer str1=new StringBuffer(scan.nextLine());
		System.out.println("Enter the String 2:");
		StringBuffer str=new StringBuffer(scan.nextLine());
		rev(str);
		System.out.println(concat(str1,str));
		scan.close();
	}

}
