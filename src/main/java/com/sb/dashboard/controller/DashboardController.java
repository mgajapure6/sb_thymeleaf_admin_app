package com.sb.dashboard.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@GetMapping("/analytic")
	public String dashboard1(HttpSession session) {
		return "dashboard/analytic.html";
	}
	
	@GetMapping("/ecom")
	public String dashboard2() {
		return "dashboard/ecom.html";
	}

}
