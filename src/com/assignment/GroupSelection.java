/**
 * 
 */
package com.assignment;
import java.util.*;
/**
 * Group selection
 * @author ssampath
 * Date 25/04/2023
 */
public class GroupSelection {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ticketNo=scan.nextInt();
		if(ticketNo%10==0) {
			System.out.println("Group Leader");
		}else {
			System.out.println("Group Member");
		}
		scan.close();
	}
	
}
