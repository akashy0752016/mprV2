package com.ddugky.mprmis.config.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.ddugky.mprmis.bean.master.AccessModuleListForUserAndMenuBean;
import com.ddugky.mprmis.repository.user.AssignRoleMasterDao;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	
	@Autowired
	AssignRoleMasterDao assignRoleMasterDao;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		CustomUserDetails customUserDetails = (CustomUserDetails)authentication.getPrincipal();
		AccessModuleListForUserAndMenuBean moduleList = assignRoleMasterDao.getAccessModuleListForMenu(customUserDetails.getUserMaster());
		session.setAttribute("moduleList", moduleList);
		response.sendRedirect("./dashboard");
	}

}
