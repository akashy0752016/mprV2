package com.ddugky.mprmis.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = {"/dashboard" }, method = RequestMethod.GET)
    public String homePage(Model model) {
        return "dashboard";
    }
	
	@RequestMapping(value = {"/", "/login" }, method = RequestMethod.GET)
    public ModelAndView login(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		if ((!(auth instanceof AnonymousAuthenticationToken))) {
			return new ModelAndView("redirect:/dashboard");
		}
		ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("message","from login");
				modelAndView.setViewName("login");
//		return new ModelAndView("login");
        return modelAndView;
    }
	
	@RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
    public String contactusPage(Model model) {
        model.addAttribute("address", "Vietnam");
        model.addAttribute("phone", "...");
        model.addAttribute("email", "...");
        return "contactusPage";
    }
	
}
