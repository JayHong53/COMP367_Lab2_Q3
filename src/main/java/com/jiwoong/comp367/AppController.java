package com.jiwoong.comp367;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String getMain(Model model) {
		
		String title = "Welcome to COMP367, Jiwoong";
		String subTitle = "We learn Jenkins and it is fun!";
		
		model.addAttribute("title", title);
		model.addAttribute("subTitle", subTitle);
		
		return "index";
	}

}
