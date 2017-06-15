package com.collab;

import java.util.HashMap;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
//@SOAPBinding(style = Style.RPC)
public class Categories {
	
	HashMap<Integer, Category> categoryMap = new HashMap<Integer, Category>();

	@WebMethod
	public Category getCategory(int categoryId){
		if(categoryMap.containsKey(categoryId)) {
			return categoryMap.get(categoryId);
		}
		else 
			return null;
	}
	
	@WebMethod(exclude = true)
	public void createMap() {
		Category c1 = new Category();
		c1.setCategoryId(1);
		c1.setCategoryName("Fruit");
		categoryMap.put(1, c1);
		
		Category c2 = new Category();
		c2.setCategoryId(2);
		c2.setCategoryName("Vegitable");
		categoryMap.put(2, c2);
	}
}




