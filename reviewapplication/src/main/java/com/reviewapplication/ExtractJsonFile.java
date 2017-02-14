package com.reviewapplication;




public class ExtractJsonFile {

}
/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JSONArray getReviewStatus(){
		JSONArray movies = null;

		try {
			JSONParser parser = new JSONParser();
			Path currentRelativePath = Paths.get("");
			String s = currentRelativePath.toAbsolutePath().toString(); 
			System.out.println("Current relative path is: " + s);

			String filePath = s+ "\\mine_twitter_target_display.json";			 
			String newPath = filePath.replace('\\', '/');	


			movies = (JSONArray) parser.parse(new FileReader(newPath));

			for(Object obj: movies){

				//Object obj = parser.parse(new FileReader(newPath));

				JSONObject movie = (JSONObject) obj;
				System.out.println(movie);
			}
			System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }


		} catch (Exception e) {
			e.printStackTrace();
		}
		return movies;
	}
}*/


