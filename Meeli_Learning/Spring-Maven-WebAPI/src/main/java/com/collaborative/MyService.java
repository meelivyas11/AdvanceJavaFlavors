package com.collaborative;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String getMyName() {
		String s = "Meeli";
		return s;

	}

	public MyDetails getMyDetails() {
		MyDetails md = new MyDetails();
		md.setFirstName("Meeli");
		md.setLastName("Vyas");
		return md;
	}

}
