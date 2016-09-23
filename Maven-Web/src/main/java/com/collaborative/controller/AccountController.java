package com.collaborative.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collaborative.domain.Contact;
import com.collaborative.factory.ServiceFactory;
import com.collaborative.service.AccountService;

/**
 * Servlet implementation class AccountController
 */
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//test
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phoneNumber");

		AccountService accountService = ServiceFactory.getAccountService();
		Contact contact = accountService.createAccount(fName, lName, email, Integer.parseInt(phone));
		request.setAttribute("ContactObj", contact);
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/ViewAccount.jsp");
		dispatcher.forward(request, response);
	}

}
