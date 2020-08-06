package com.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {


	@GetMapping("/")
	public String roomForm(Model model) {		
		return "/index";
	}

	@GetMapping("/index")
	public String getIndex(Model model) {
		return "/index";
	}

	@PostMapping("/index")
	public String chatForm(Model model) {		
		return "redirect:/chat";
	}

	@GetMapping("/chat")
	public String chat(@RequestParam(value = "username") String username,
			@RequestParam(value = "room") String room, Model model) {
		model.addAttribute("room", room);
		model.addAttribute("username", username);		
		return "chat";
	}

}
