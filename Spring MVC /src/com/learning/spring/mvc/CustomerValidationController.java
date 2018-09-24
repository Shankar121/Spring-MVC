package com.learning.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.spring.bean.Customer;


@Controller
@RequestMapping("/validation")
public class CustomerValidationController {
	
	@InitBinder
	public void preProcessWebData(WebDataBinder dataBinder) {
		StringTrimmerEditor trimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmerEditor);
	}

	@RequestMapping("/viewForm")
	public String viewCustomerForm(Model model) {
		model.addAttribute("customerForm", new Customer());
		return "customer-validation-form";
	}
	// the BindingResult parameter must immediately after the model attribute.
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customerForm") Customer customer, BindingResult bindingResult, Model model) {
		System.out.println("bindingResult: "+bindingResult);
		if(bindingResult.hasErrors()) {
			return "customer-validation-form";
		}
		model.addAttribute("customer",customer);
		return "customer-result";
	}
	
}
