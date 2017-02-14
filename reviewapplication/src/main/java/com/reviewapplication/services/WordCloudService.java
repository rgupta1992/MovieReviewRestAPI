package com.reviewapplication.services;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.reviewapplication.models.WordCloud;

public class WordCloudService {
	
	
	public List<WordCloud> getWordCloud(){
		
		JSONArray movies = null;
		List<WordCloud> status = new ArrayList<>();
		try {
			JSONParser parser = new JSONParser();			
			
			String path = "C:/codebase/ReviewAppCodes/ReviewWebApp/reviewapplication/mine_twitter_target_tag_cloud.json";		
			movies = (JSONArray) parser.parse(new FileReader(path));

			for(Object obj: movies){			

				JSONObject movie = (JSONObject) obj;
				String name = (String) movie.get("value");
		        String count1 =  (String) movie.get("count");
		        int count = Integer.parseInt(count1);
		        
				WordCloud wc = new WordCloud(name, count);
				System.out.println(wc);
				status.add(wc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
