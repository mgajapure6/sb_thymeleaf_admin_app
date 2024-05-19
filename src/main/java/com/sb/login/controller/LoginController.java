package com.sb.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sb.login.dto.LoginDto;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping()
	public String redirect() {
		return "login/login.html";
	}
	
	@PostMapping()
	public String processLogin(LoginDto login, RedirectAttributes redirect) {
		return "redirect:/home";
	}

}
