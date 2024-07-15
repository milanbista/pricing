package com.pricing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PricingController {

	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/price/{productCode}")
	@ResponseBody
	public Double price(@PathVariable(name="productCode") int productCode) {
		return 1200.00;
	}
}
