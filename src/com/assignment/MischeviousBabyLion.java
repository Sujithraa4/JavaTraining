package com.assignment;
import java.util.Scanner;
/**
 * Check whether the baby lion is mischievous
 * @author ssampath
 * Date 27/04/2023
 */
public class MischeviousBabyLion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total=scan.nextInt();
		int rabbit=scan.nextInt();
		int deer=scan.nextInt();
		int birds=scan.nextInt();
		int squirrels=scan.nextInt();
		int mornCount=rabbit+deer+birds+squirrels;
		if(mornCount<total)
			System.out.println("Baby lion is mischievous");
		else if(mornCount==total)
			System.out.println("Baby lion is well behaved");
		else
			System.out.println("Counted Wrongly");
		scan.close();
	}

}
