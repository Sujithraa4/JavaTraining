/**
 * 
 */
package com.javafundas;
import java.util.*;
/**
 * Search system for movies
 * @author ssampath
 * Date 25/04/2023
 */
public class SearchForMovies {
	public static void main(String[] args) {
		System.out.println("**Welcome to the movie search page**");
		System.out.println("Select the type to search the movies:");
		System.out.println("1. Search by Title \n2. Search by Language \n3. Search by Release Date \n4. Search by Genre");
		System.out.println("Enter your choice: ");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your searching choice is Movies by Title");
			break;
		case 2:
			System.out.println("Your searching choice is Movies by Language");
			break;
		case 3:
			System.out.println("Your searching choice is Movies by Release Date");
			break;
		case 4:
			System.out.println("Your searching choice is Movies by Genre");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		scan.close();
	}

}
