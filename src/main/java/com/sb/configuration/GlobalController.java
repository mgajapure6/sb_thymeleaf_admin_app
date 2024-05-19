package com.sb.configuration;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalController {
	
	@ModelAttribute("currentPath")
    String getRequestServletPath(HttpServletRequest request) {
        return request.getServletPath();
    }

}
