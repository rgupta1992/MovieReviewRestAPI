package com.reviewapplication.services;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.reviewapplication.models.ReviewStatus;


public class ReviewStatusService {
	
	public List<ReviewStatus> getReviewStatus(){
		JSONArray movies = null;
		List<ReviewStatus> status = new ArrayList<>();
		try {
			JSONParser parser = new JSONParser();			
			
			String path = "C:/codebase/ReviewAppCodes/ReviewWebApp/reviewapplication/mine_twitter_target_display.json";		
			movies = (JSONArray) parser.parse(new FileReader(path));

			for(Object obj: movies){			

				JSONObject movie = (JSONObject) obj;
				String movieName = (String) movie.get("movieName");
				String review = (String) movie.get("review");
		        String isPositive = (String) movie.get("isPositive");
		        
				ReviewStatus rs = new ReviewStatus(movieName, review, isPositive);
				System.out.println(rs);
				status.add(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
