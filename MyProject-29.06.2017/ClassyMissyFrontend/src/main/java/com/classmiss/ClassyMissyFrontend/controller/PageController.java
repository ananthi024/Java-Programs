package com.classmiss.ClassyMissyFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
@RequestMapping("/AboutUs")
public String ShowAboutUs()
{
	return "AboutUs";
	
}
}