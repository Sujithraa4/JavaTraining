/**
 * 
 */
package StringAssignment8;
import java.util.*;
/**
 * @author ssampath
 *
 */
/*class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String s) {
		super(s);
	}
}*/
class InvalidUserNameException extends Exception{
	public InvalidUserNameException(String s) {
		super(s);
	}
}

public class UsernamePasswordValidation {
	public static boolean characterCheck(String name) {
		boolean res=true;
		int count=0;
		for(int i=0;i<name.length();i++) {
			int x=name.charAt(i);
			if((x>64)&&(x<92)) {
				count++;
				break;}
			else if ((x>96)&&(x<124)) {
				count++;
				break;}
			else if ((x>47)&&(x<58)) {
				count++;
				break;}
			else if(name.contains("_")||(name.contains("&"))) {
				count++;
				break;}
			else {
				res=false;
				break;}
		}
		if (count!=4)
				res=false;
		return res;
	}
	public static void userNameValidation(String name)throws Exception {
		if ((name.length()>8)&&(characterCheck(name))){
			System.out.println("Successfully logged in");
		}
		else
			throw new InvalidPasswordException("**Username you have entered doesn't meet the required criteria**");
	}
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user name: ");
		String name=scan.nextLine();
		
		userNameValidation(name);
		System.out.println("Enter password: ");
		String pass=scan.nextLine();
		
		System.out.println("UserName: "+name+"\nPassword: "+pass);
		scan.close();
	}

}
