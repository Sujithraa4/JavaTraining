/**
 * 
 */
package StringAssignment8;
import java.util.*;
/**
 * @author ssampath
 *
 */
class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String s) {
		super(s);
	}
}

public class UserDefinedException {
	public static void PasswordValidation(String pass)throws Exception {
		if (pass.equals("Suji*1234")) {
			System.out.println("Successfully logged in");
		}
		else
			throw new InvalidPasswordException("**Password you have entered is incorrect**");
	}
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user name: ");
		String name=scan.nextLine();
		System.out.println("Enter password: ");
		String pass=scan.nextLine();
		PasswordValidation(pass);
		/*
		try {
			PasswordValidation(pass);
		}
		catch(Exception e) {
			System.out.println(e);
		}*/
		System.out.println("UserName: "+name+"\nPassword: "+pass);
		scan.close();
	}

}
