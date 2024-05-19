package com.sb.home.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sb.home.dto.MenuDto;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping()
	public String redirect(HttpSession session) throws Exception {
		List<MenuDto> menuDtoList = new ObjectMapper().readValue(ResourceUtils.getFile("classpath:static/menu.json"), List.class);
		session.setAttribute("menuList", menuDtoList);
		return "home/home.html";
	}

}
