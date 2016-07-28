package com.collaborative.serviceImpl;

import com.collaborative.domain.Contact;

public class AccountServiceImpl {

	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public Contact createAccount(String firstName, String lastName, String email, int phoneNumber) {
		// TODO Auto-generated method stub
		
		Contact c = new Contact();
		c.setFirstName(firstName);
		c.setLastName(lastName);
		c.setEmail(email);
		c.setPhoneNumber(phoneNumber);
		
		return c;
	}

}
