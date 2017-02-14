package com.reviewapplication.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.reviewapplication.services.AddReviewService;

@Path("/addreview")
public class AddReviewResource {
	AddReviewService addReviewService = new AddReviewService();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String sendReviewToPython(@QueryParam("movieName") String movieName,
									@QueryParam("review") String review)
	{
		System.out.println("movieName:"+movieName+"review:"+review);
		addReviewService.sendReviewToPython(movieName, review);	
		return "Review Added";
	}
}
