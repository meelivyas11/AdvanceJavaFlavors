package com.collab;

import java.util.HashMap;
import javax.jws.WebService;

@WebService(endpointInterface="com.collab.ICategories", 
	portName="CatPortName", serviceName="CatServiceName")
public class CategoriesImpl implements ICategories{

	HashMap<Integer, Category> categoryMap = new HashMap<Integer, Category>();
	
	@Override
	public Category getCategory(int categoryId) {
		if(categoryMap.containsKey(categoryId)) {
			return categoryMap.get(categoryId);
		}
		else 
			return null;
	}
}


