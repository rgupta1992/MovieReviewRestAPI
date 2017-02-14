package com.reviewapplication.models;

public class ReviewStatus {
	
	private String movieName;
	private String review;
	private String isPositive;	
	
	public ReviewStatus() {
		
	}

	public ReviewStatus(String movieName, String review, String isPositive) {
		super();
		this.movieName = movieName;
		this.review = review;
		this.isPositive = isPositive;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getIsPositive() {
		return isPositive;
	}

	public void setIsPositive(String isPositive) {
		this.isPositive = isPositive;
	}
	
	
	
	
}
