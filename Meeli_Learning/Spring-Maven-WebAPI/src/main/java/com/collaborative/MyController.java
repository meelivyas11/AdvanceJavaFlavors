package com.collaborative;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/MyController")
public class MyController {
	
	@Autowired
	private MyService myService;
	
	
	@RequestMapping(value = "/GetMyName", method = RequestMethod.GET)
	public String GetMyName() {
		String myName = myService.getMyName();
		System.out.println(myName);
		return "showMyName";
	}
	
	/**
	 * This method called "getMyDetails" method from myService (bean) 
	 * @return JSON Object
	 */
	@RequestMapping(value = "/GetMyDetails", method = RequestMethod.GET)
	public @ResponseBody 
	MyDetails GetMyDetails() {
		MyDetails myDetails = myService.getMyDetails();
		System.out.println(myDetails); // This just prints object not the JSON
		return myDetails;
	}

	@RequestMapping(value = "/SendMyName", method = RequestMethod.GET)
	public String SendModel(Model model) {
		String myName = myService.getMyName();
		System.out.println(myName);
		model.addAttribute("Fname", "Meeli");
		model.addAttribute("Lname", "Vyas");
		System.out.println(model);
		return "GetModelVal";
	}
	
	
	/*@RequestMapping(value = "/SendDropDown", method = RequestMethod.GET)
	public String SendDrowDown(Model model) {
		Map<Integer, String> courseList = new HashMap<Integer, String>();
		courseList.put(1, "ABC");
		courseList.put(2, "DD");
		courseList.put(3, "EE");
		
		return "GetModelVal";
	}*/
	
}
