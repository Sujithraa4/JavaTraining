package com.methodpackages;
import java.util.*;
import com.javafundas.*;
/**
 * Creating packages for methods
 * @author ssampath
 * Date 26/04/2023
 */
public class GreetUserMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String user=scan.nextLine();
		String name=GreetUser.printMessage(user);
		System.out.println("Welcome home "+name+" !");
		scan.close();
	}

}