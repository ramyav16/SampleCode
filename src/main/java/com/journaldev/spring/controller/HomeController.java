package com.journaldev.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

	@RequestMapping(value = "/testing.action", method = RequestMethod.POST)
	public @ResponseBody
	void sampleCode(
			@RequestBody String sampleInput, ModelMap model,
			HttpServletRequest request, HttpServletResponse response) {
			System.out.println("This is the req body: " + sampleInput);
		}
}
