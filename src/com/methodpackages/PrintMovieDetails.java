/**
 * 
 */
package com.methodpackages;
/**
 * Printing movie details
 * @author ssampath
 * Date 26/04/2023
 */
class MovieDetails{
	public static void movieDetail(String title,String descrip,int duration,String lang,String releaseDate,String country,String genre) {
		System.out.println("Movie Title: "+title+"\nMovie Description: "+descrip+"\nMovie Duration: "+duration+"\nMovie Language: "+lang+"\nMovie Release Date: "+releaseDate+"\nMovie Country: "+country+"\nMovie Genre"+genre);
	}
}
public class PrintMovieDetails {
	public static void main(String[] args) {
		System.out.println("----*Movie Details*----");
		String title="SSS";
		String des="Movieof2001";
		int duration=3;
		String lang="English";
		String release="25/04/2023";
		String country="India";
		String genre="Fantacy";
		MovieDetails.movieDetail(title,des,duration,lang,release,country,genre);
		System.out.println("----*~*----");
	}
}
