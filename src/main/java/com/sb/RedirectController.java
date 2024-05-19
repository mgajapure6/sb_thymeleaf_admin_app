package com.sb;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sb.home.dto.MenuDto;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping()
public class RedirectController {
	
	@GetMapping("/")
	public RedirectView redirect(HttpSession session) throws Exception {
		@SuppressWarnings("unchecked")
		List<MenuDto> menuDtoList = new ObjectMapper().readValue(ResourceUtils.getFile("classpath:static/menu.json"), List.class);
		session.setAttribute("menuList", menuDtoList);
		return new RedirectView("/dashboard/analytic");
	}

}
