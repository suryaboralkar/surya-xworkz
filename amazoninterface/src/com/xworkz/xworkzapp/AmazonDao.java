package com.xworkz.xworkzapp;

import java.util.Date;


	public interface AmazonDao {
		static final String username = "amazon@123.com";
		static final String password = "amazon123";

		public void viewSubscriber(String sub);

		public void loginId(String username, String password);

		public void addMovies(AmazonDto amazon);

		public void displayMovieDetails();

		default void displayDate() {
			System.out.println(new Date());
		}
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

