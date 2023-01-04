package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {

	@GetMapping("/wish") // we no need to give anything it will act as welcome page
	public ModelAndView getWishMsg() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "All the Best...!!");
		mav.setViewName("wish");

		return mav;
	}
}
