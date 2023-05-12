/**
 * 
 */
package StringAssignment8;
import java.util.*;
/**
 * Check if the string is rotation of other string
 * @author Sujithraa
 * Date 05/05/2023
 */
public class RotationCheck {
	public static boolean rotation(String str1,String str) {
		if(str1.length()==str.length()) {
			if((str1+str1).contains(str)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String str1=scan.nextLine();
		System.out.println("Enter the String 2:");
		String str=scan.nextLine();
		System.out.println(rotation(str1,str));
		scan.close();
	}

}
