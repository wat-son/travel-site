package com.example.travelsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllController {

	@GetMapping("/")
	public String top() {
	    return "top"; // ← templates/index.html が必要
	}
}