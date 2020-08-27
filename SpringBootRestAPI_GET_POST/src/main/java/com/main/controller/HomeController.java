package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.model.Student;
import com.main.service.HService;

@Controller
public class HomeController {
	
	@Autowired
	HService hs;
	
	@RequestMapping("/")
	public String loginpage()
	{
		return "login";
	}
	

	
	@RequestMapping(value="/save")
	public String register(@ModelAttribute("stu") Student s)
	{
	
		Student a=hs.savedata(s);
		
		return "register";
		

	}
	
	@RequestMapping(value="/reg")
	public String register()
	{
		return "register";
		
	}
	
	
	@RequestMapping(value="/log")
	public String login(@ModelAttribute("stu")Student s, Model m) 
	{
		if(s.getUsername().equals("spring")&& s.getPassword().equals("test123"))
		{
			
			List<Student> listStudent=hs.getAllData();
			
			m.addAttribute("stud",listStudent);
			return "success";
		}
		else
		{
			
			List<Student> li=hs.loginCheck(s.getUsername(),s.getPassword());
			m.addAttribute("stud",li);
			return "success";
		}
		
	
		
		
	}

	 

}
