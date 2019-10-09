package com.ddugky.mprmis.config.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.ddugky.mprmis.bean.master.AccessModuleListForUserAndMenuBean;
import com.ddugky.mprmis.model.projectSetup.ProjectDetails;
import com.ddugky.mprmis.service.LoginService;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	
	@Autowired
	private LoginService loginService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		CustomUserDetails customUserDetails = (CustomUserDetails)authentication.getPrincipal();
		AccessModuleListForUserAndMenuBean moduleList = loginService.getAccessModuleListForMenu(customUserDetails.getUserMaster());
		List<ProjectDetails> assignProjectList=loginService.getAssignProjectList(customUserDetails.getUserMaster());
		session.setAttribute("assignProjectDetails",assignProjectList);
		session.setAttribute("userBeanData", moduleList);
		response.sendRedirect("./dashboard");
	}

}
