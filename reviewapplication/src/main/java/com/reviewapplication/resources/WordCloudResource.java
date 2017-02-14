package com.reviewapplication.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.reviewapplication.models.WordCloud;
import com.reviewapplication.services.WordCloudService;

@Path("/wordcloud")
public class WordCloudResource {
	
	WordCloudService wcs = new WordCloudService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<WordCloud> getWordCloudTags()
	{
		return wcs.getWordCloud();
	}
}
