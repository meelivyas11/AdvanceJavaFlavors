package com.collab.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.collab.DAO.UserDAO;
import com.collab.Domains.User;


@Component
@Path("")
public class Users {

	@Autowired
	private UserDAO userDao;
	
	@GET
	@Path("auth/users") // http://localhost:8081/Restful_Spring_Hibernate/collab/webapi/auth/users
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers() {
		 return userDao.findAll();
	}
	
	@POST
	@Path("auth/users") // http://localhost:8081/Restful_Spring_Hibernate/collab/webapi/auth/users
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User add(User u) {
		User user = new User();
		user.setUserName(u.getUserName());
		user.setPassword(u.getPassword());
		
		userDao.create(user);
		
		return u;
	}
	
	@POST
	@Path("users/validate") // http://localhost:8081/Restful_Spring_Hibernate/collab/webapi/users/validate
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User authenticateUserDetails(User u) {
		User validUser = userDao.find(u.getUserName(), u.getPassword());
		return validUser;
	}
	
	@PUT
	@Path("auth/users/{userId}")  // http://localhost:8081/Restful_Spring_Hibernate/collab/webapi/auth/users/{userId}
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User updateChamberInfo(@PathParam("userId") long userId , User userInfo) {
		userInfo.setUserId(userId);
		userDao.update(userInfo);
		return userInfo;
	}
}
