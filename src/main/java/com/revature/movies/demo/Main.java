package com.revature.movies.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Movie m = new Movie(8.5, "Jaws",1974);
		Movie m1 = new Movie(4, "Sandals", 1980);
		Movie m2 = new Movie(7.5,"Where's Aldo?: Part 2", 2050);
		Movie m3 = new Movie(10, "Jorge's Movie",2022);
		
		
		ArrayList<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(m);
		moviesList.add(m1);
		moviesList.add(m2);
		moviesList.add(m3);
		
		//System.out.println(moviesList);
		
		//sort is a static method  and Collections is a class
		Collections.sort(moviesList);
		
		
//		for(Movie ele: moviesList) {
//			System.out.println(ele);
//		}
		
		
		RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(moviesList, ratingCompare);
//        for (Movie ele: moviesList) 
//        	System.out.println(ele);
       
        
        for (Movie movie: moviesList)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
	}

}
