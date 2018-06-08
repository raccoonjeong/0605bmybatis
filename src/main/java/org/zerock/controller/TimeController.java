package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.persistence.TimeMapper;

@Controller
public class TimeController {
	
	@Autowired
	TimeMapper mapper;
	
	@GetMapping("/showtime")
	public void showtime(Model model) {
		model.addAttribute("now",mapper.getTimeXML());
		
	}

}
