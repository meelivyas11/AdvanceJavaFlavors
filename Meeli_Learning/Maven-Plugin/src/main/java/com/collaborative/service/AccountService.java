package com.collaborative.service;

import com.collaborative.domain.Contact;

public interface AccountService {
		
		public Contact createAccount(String firstName, String lastName, String email, int phoneNumber);

}
