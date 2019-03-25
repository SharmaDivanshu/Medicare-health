package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.entity.Admin;

@Controller
public class AdminController {
	
	 @RequestMapping(value="index.htm",method=RequestMethod.GET)
	   public String loadForm(){
		   return "registration";
	 }
	
	@RequestMapping(value="doLogin.htm",method=RequestMethod.GET)
	@ModelAttribute("admin")
	public Admin createCommandobject()
	{
		Admin admin=new Admin();
		admin.setAdminId(0);
		admin.setFirstName("Please enter in capitals");
		admin.setLastName("Please enter in capitals");
		admin.setDoB("dd-mm-yyyy");
		admin.setEmail_Id("Enter valid email id");
	    return admin;
	}

}
