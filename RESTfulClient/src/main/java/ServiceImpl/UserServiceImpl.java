package ServiceImpl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Domain.User;

@WebServlet("/UserServ")
public class UserServiceImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public UserServiceImpl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = ClientBuilder.newClient();
		WebTarget userTarget = client.target("http://localhost:8081/RESTful/webapi/users");
		Response res = userTarget.request(MediaType.APPLICATION_JSON).get();
		
		List<User> lst =  (List<User>) res.readEntity(new GenericType<List<User>>(){});
		for (User user : lst) {
			System.out.println("User Name: " + user.getUserName() + " --- Password: " + user.getPassword());
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = ClientBuilder.newClient();
		WebTarget userTarget = client.target("http://localhost:8081/RESTful/webapi/users");
		User user = new User();
		user.setUserName(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		Response res = userTarget.request(MediaType.APPLICATION_JSON)
							.post(Entity.json(user));
		
		System.out.println("Response Status for Post Request:" + res.getStatus()); 
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
