package com.reviewapplication.util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUtil {
	
	public String getPathForReviews()
	{
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString(); 
		System.out.println("Current relative path is: " + s);

		String filePath = s+ "\\mine_twitter_target_display.json";			 
		String newPath = filePath.replace('\\', '/');
		
		return newPath;
	}

}
