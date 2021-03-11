package com.xworkz.xworkzapp;

public class AmazonTester {

	public static void main(String[] args) {

		AmazonDto amazonDTO = new AmazonDto("amazon@123.com", "amazon123", "Uppena", "1.4gb", "Vaisshnav Tej", "Krithi Shetty");

		AmazonService amazon = new AmazonServiceImpl();

		amazon.addMovies(amazonDTO);

		
		 amazon.loginId("amazon@123.com", "amazon123");
		 amazon.displayMovieDetails();
		amazon.subscribers();
	}

}
