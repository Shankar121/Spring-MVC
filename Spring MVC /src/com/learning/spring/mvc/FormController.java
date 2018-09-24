package com.learning.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping("/viewForm")
	public String viewForm() {
		return "view-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,@RequestParam("studentName") String studName, Model model) {
		String studentName=request.getParameter("studentName");
		model.addAttribute("message","yo! "+studName.toUpperCase());
		return "process-form";
	}
	
	
}
