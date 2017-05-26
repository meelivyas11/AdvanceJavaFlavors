package com.collab.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.collab.Domains.User;

@Path("users")
public class Users {
	
	static List<User> userList = new ArrayList<User>();

	@GET	// http://localhost:8080/Restful/webapi/users
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers() {
		 return userList;
	}
	
	@POST	// http://localhost:8080/Restful/webapi/users
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User add(User u) {
		User user = new User();
		user.setUserName(u.getUserName());
		user.setPassword(u.getPassword());
		userList.add(user);
		return user;
	}
}
