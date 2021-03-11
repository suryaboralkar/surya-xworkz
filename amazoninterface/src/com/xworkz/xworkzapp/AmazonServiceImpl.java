package com.xworkz.xworkzapp;

public class AmazonServiceImpl implements AmazonService {
	private AmazonDao daoimpl = new AmazonDaoImpl();

	@Override
	public void loginId(String username, String pass) {
		if (username != null && username.contains("@") && username.contains(".com") && pass.length() > 6 ){
			daoimpl.loginId(username, pass);
			System.out.println("user name     : "+AmazonDao.username);
			System.out.println("user password : "+AmazonDao.password);
		}else{
			System.out.println("Please Enter Valid Cridentails ");
		}
	}

	@Override
	public void addMovies(AmazonDto Moviename) {
		if (Moviename != null) {
			daoimpl.addMovies(Moviename);
			System.out.println("adding movies");
		} else {
			System.out.println(" invalid movie name ");
		}

	}

	@Override
	public void displayMovieDetails() {
		System.out.println("Display Movie Details");
		daoimpl.displayMovieDetails();

	}

	@Override
	public void subscribers() {
		System.out.println("subscribers list");
		daoimpl.viewSubscriber(null);
		
		
	}

}


