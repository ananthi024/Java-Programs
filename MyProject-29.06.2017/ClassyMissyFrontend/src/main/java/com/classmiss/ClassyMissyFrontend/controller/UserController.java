package com.classmiss.ClassyMissyFrontend.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.classmiss.ClassyMissyBackend.dao.UserDetailsDAO;
import com.classmiss.ClassyMissyBackend.model.UserDetails;

@Controller
public class UserController {
	
	
		@Autowired
		UserDetailsDAO userDetailsDAO;
				
		@RequestMapping("/UserDetails")
		public String showProduct(Model m)
		{
			
			
			UserDetails userDetails=new UserDetails();
			m.addAttribute("userlist",this.getUserList());
			
			m.addAttribute("UserDetails",userDetails);
			
			List<UserDetails> userlist=userDetailsDAO.getUserDetails();
			m.addAttribute("userlist",userlist);
			
			return "UserDetails";
		}
		
		@RequestMapping(value="/InsertUserDetails",method=RequestMethod.POST)
		public String insertUserDetails(@ModelAttribute("userdetails") UserDetails userDetails,Model m)
		{
			System.out.println("---User Inserted---");
			userDetailsDAO.insertUpdateUserDetails(userDetails);
				
			
			List<UserDetails> userlist=userDetailsDAO.getUserDetails();
			m.addAttribute("userlist",userlist);
			
			return "UserDetails";
		}
		
		@RequestMapping(value="/updateUserDetails/{uname}")
		public String updateUserDetails(@PathVariable("uname")String uname,Model m)
		{
			UserDetails userDetails=userDetailsDAO.getUserDetails(uname);
			m.addAttribute("userdetails", userDetails);
			
			m.addAttribute("userlist",this.getUserList());
			List<UserDetails> userlist=userDetailsDAO.getUserDetails();
			m.addAttribute("userlist",userlist);
			
			return "redirect:/UserDetails";
			
		}
		
		@RequestMapping(value="/deleteUserDetails/{uname}")
		public String deleteUserDetails(@PathVariable("uname")String uname,Model m)
		{
			UserDetails userDetails=userDetailsDAO.getUserDetails(uname);
			userDetailsDAO.deleteUserDetails(userDetails);
			
			UserDetails userDetails1=new UserDetails();
			m.addAttribute("userdetails",userDetails1);
			
			m.addAttribute("userlist",this.getUserList());
			List<UserDetails> userlist=userDetailsDAO.getUserDetails();
			m.addAttribute("userlist",userlist);
			
			return "UserDetails";		}
		
		public LinkedHashMap<String,String> getUserList()
		{
			List<UserDetails> list=userDetailsDAO.getUserDetails();
			
			LinkedHashMap<String,String> userlist=new LinkedHashMap<String,String>();
			
			for(UserDetails user:list)
			{
				userlist.put(user.getUname(),user.getPassword());
			}
			
			return userlist;
		}
		
}
