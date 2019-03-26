package com.cognizant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.Admin;
import com.cognizant.entity.PatientDetails;

import com.cognizant.service.PatientRegistrationService;

@Controller
public class AdminController {
	@Autowired 
	private PatientRegistrationService patientService;
	@Autowired
	private Validator validator;
	
	

	   @ModelAttribute("admin")
	   public Admin createCommandObject(){
		   Admin admin=new Admin();		   
		   return admin ;
		   }
	 @RequestMapping(value="index.htm",method=RequestMethod.GET)
	   public String loadForm(){
		   return "registration";
	 }
	
	
	@ModelAttribute("admin")
	public Admin createCommandobject()
	{
		Admin admin=new Admin();
		admin.setFirstName("Please enter in capitals");
		admin.setLastName("Please enter in capitals");
		admin.setDoB("dd-mm-yyyy");
		admin.setEmail_Id("Enter valid email id");
	    return admin;
	}
	
	
	
	@ModelAttribute("patientDetails")
	   public PatientDetails createCommandObjects(){
		   PatientDetails patientDetails=new PatientDetails();		   
		   return patientDetails ;
		   }
	
	
	
	public ModelAndView viewPatientDetails()
	{
		List<PatientDetails> patientList= patientService.getAllPatients();
		ModelAndView mv=new ModelAndView();
		mv.addObject("patientList", patientList);
		mv.setViewName("viewpatient");
		return mv;
	}
	
	public ModelAndView persistPatient(@ModelAttribute("patientDetails")PatientDetails patientDetails,Errors errors)
	{
		ModelAndView mv=new ModelAndView();
		ValidationUtils.invokeValidator(validator, patientDetails, errors);
		if(errors.hasErrors())
		{
			mv.setViewName("home");
		}
		else
		{
			boolean persistPatient=patientService.patientPersist(patientDetails);
			if(persistPatient)
			{
				mv.addObject("status", "Patient Sucessfully registered");
				List<PatientDetails> patientList=patientService.getAllPatients();
				mv.addObject("patientList", patientList);
				mv.setViewName("welcome");
				return mv;
			}
			else
			{
				mv.addObject("status", "Registered failed");
				
			}
			mv.setViewName("registration");
		}
		return mv;
			
	}
}
