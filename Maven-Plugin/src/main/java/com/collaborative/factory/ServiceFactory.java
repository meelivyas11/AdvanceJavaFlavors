package com.collaborative.factory;

import com.collaborative.factory.ServiceFactory;
import com.collaborative.service.AccountService;
import com.collaborative.serviceImpl.AccountServiceImpl;

public class ServiceFactory {

	public static AccountService getAccountService() {
		
		return new AccountServiceImpl();
	}
}
