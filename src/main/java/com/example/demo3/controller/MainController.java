package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class MainController {
	@RequestMapping("/main")
	public ModelAndView main() {
		ModelAndView mv=new ModelAndView("/main");
		return mv;
	}

}
