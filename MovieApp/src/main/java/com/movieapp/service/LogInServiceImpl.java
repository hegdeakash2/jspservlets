package com.movieapp.service;

import java.util.stream.Stream;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class LogInServiceImpl implements ILoginService {
	String[] usernames = { "john", "sri", "priya", "rahul", "joe" };

	@Override
	public boolean validateUsername(String username,String password) {
		/*
		 * for (String names : usernames) { if(names.equals(username)) { return true; }
		 * } if( password.equals("Admin@123")) { return true; }
		 */
		
	return Stream.of(usernames)
	.filter(str->str.equals(username)&& password.equals("admin@123"))
	.findAny()
	.isPresent();
		
		
	}

}
