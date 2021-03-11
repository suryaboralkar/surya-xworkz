package com.xworkz.xworkzapp;

public class AmazonDaoImpl implements AmazonDao {
	AmazonDto dto[] = new AmazonDto[5];
	int index = 0;

	String subscriber[] = { "surya","saichetan","akash","arun" };

	@Override
	public void loginId(String user, String pass) {
		if (user.equals(username) && pass.equals(password)) {
			System.out.println("Welcome to amazon prime");
		} else {
			System.out.println("valid Credentails");
		}

	}

	@Override
	public void addMovies(AmazonDto amazon) {
		dto[index] = amazon;
		index++;
		System.out.println("details Added successfull...");
	}

	@Override
	public void displayMovieDetails() {
		for (int i = 0; i < index; i++) {
			if (dto[i] != null) {
				System.out.println("movie name is:"+ dto[i].getMovieName());
				System.out.println("actor of the movie is:"+dto[i].getActor());
				System.out.println(" actress of the movie is : " + dto[i].getActoress());
				System.out.println("size of the movie  is: " + dto[i].getSize());

			}
		}

	}

	@Override
	public void viewSubscriber(String sub) {
		for (int i = 0; i < subscriber.length; i++) {
			System.out.println("viewed by : " + subscriber[i]);

		}

	}

}


