/**
 * 
 */
package StringAssignment8;
import java.util.*;
/**
 * Replacing all vowels with 'z'
 * @author Sujithraa
 * Date 03/05/2023
 */
public class ReplacingVowels {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		str=str.replaceAll("[aeiou]", "z");
		System.out.println(str);
		scan.close();
	}

}
