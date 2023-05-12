/**
 * 
 */
package com.javafundas;
import java.util.*;

/**
 * Printing movies based on genre
 * @author ssampath
 * Date 25/03/2023
 */
public class PrintMoviesForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie[]= {"CaptainAmerica","loveStory","Island","IronMan"};
		String genre[]= {"Action","Romance","Fantacy","Action"};
		Scanner scan=new Scanner(System.in);
		String choice=scan.nextLine();
		int count=0;
		for(String i:genre) {
			if(i.equals(choice)) {
				System.out.println(movie[count]);
			}
			count++;
		}
		scan.close();
	}

}
