package com.learning.spring.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.spring.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private LinkedHashMap<String,String> countryOptions;
	
	@RequestMapping("/form")
	public String studentForm(Model model) {
		
		Student student=new Student();
		student.setFirstName("Shankar");
		student.setLastName("Gupta");
		model.addAttribute("student",student);
		model.addAttribute("countryOptions",countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processform(@ModelAttribute("student") Student student, Model model) {
		
		model.addAttribute("student",student);
		
		return "show-student-form";
	}

}
