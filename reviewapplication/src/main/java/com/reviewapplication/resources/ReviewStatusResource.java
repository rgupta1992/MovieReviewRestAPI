package com.reviewapplication.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.reviewapplication.models.ReviewStatus;
import com.reviewapplication.services.ReviewStatusService;

@Path("/reviewstatus")
public class ReviewStatusResource {
	ReviewStatusService rss = new ReviewStatusService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReviewStatus> getWordCloudTags()
	{
		return rss.getReviewStatus();
	}
}


