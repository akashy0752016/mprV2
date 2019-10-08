package com.ddugky.mprmis.config.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ddugky.mprmis.model.user.UserMaster;

public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private UserMaster userMaster;

	public CustomUserDetails(UserMaster userMaster) {
		super();
		this.userMaster = userMaster;
	}
	
	public String getId() {
		return userMaster.getId();
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userMaster.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userMaster.getLoginId();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public UserMaster getUserMaster() {
		return userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}
}
