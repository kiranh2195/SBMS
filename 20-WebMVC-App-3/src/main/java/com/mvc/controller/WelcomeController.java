package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Spring Web MVC");
		mav.setViewName("welcome");
		return mav;
	}
}
