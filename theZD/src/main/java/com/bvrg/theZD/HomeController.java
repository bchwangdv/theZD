package com.bvrg.theZD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("main")
	public String main() {
	
		return "main";
	}
}