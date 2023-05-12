/**
 * 
 */
package StringAssignment8;
import java.util.*;
/**
 * Perform action on the string based on rules
 * @author Sujithraa
 * Date 03/04/2023
 */
public class StringRules {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		char ch[]=s1.toCharArray();
		StringBuffer str=new StringBuffer("");
		for(int i=0;i<ch.length;i++) {
			if(i%2!=0) 
				str.append(s2);
			else
				str.append(ch[i]);
		}
		System.out.println(str);
		String str1=new String(str);
		if(str1.contains(s2))
			str.replace(str.lastIndexOf(s2),(str.lastIndexOf(s2))+s2.length(),new String(new StringBuffer(s2).reverse()));
		System.out.println(str);
		str.
		scan.close();
	}
}
