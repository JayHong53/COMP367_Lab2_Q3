package com.jiwoong.comp367;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String getMain(Model model) {
		
		Calendar calendar = Calendar.getInstance();
		int time = calendar.get(Calendar.HOUR_OF_DAY);
		
		String studentName = "Jiwoong";
		String subTitle = "We learn Jenkins and it is fun!";
		
		if (time >= 0 && time < 12) {
			model.addAttribute("title", "Good Morning, " + studentName);
		}
		else {
			model.addAttribute("title", "Good Afternoon, " + studentName);
		}
				
		model.addAttribute("subTitle", subTitle);
		
		return "index";
	}

}
