package com.collaborative.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.collaborative.serviceImpl.AccountServiceImpl;

public class testAccountService {

	
	@Mock
	AccountServiceImpl accountService;
	
	@Before
	public void setup() {
		accountService = new AccountServiceImpl();
	}
	
	@After
	public void tearDown() {
		accountService = null;
	}
	
	@Test
	public void testCreateAccount() {
		accountService.createAccount("Meeli", "Vyas", "a@a.com", Integer.parseInt("1234567890"));
		
	}

}
