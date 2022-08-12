package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByLanguage(String language) {
		
		
		if(language.equalsIgnoreCase("kannada")) {
			return Arrays.asList("kgf","vikranth rona","mungaru male");
					
		}
		else if(language.equalsIgnoreCase("hindi")) {
			return Arrays.asList("sholay","aashique 2","runway 36");
		}
			
			
			else if(language.equalsIgnoreCase("english")) {
				return Arrays.asList("breaking bad","batman","365 days");
			}
		return null;
			
		
	}

}
