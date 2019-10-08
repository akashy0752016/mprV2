package com.ddugky.mprmis.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ddugky.mprmis.model.user.UserMaster;
import com.ddugky.mprmis.repository.user.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserMaster user = userRepository.findByLoginId(username.toUpperCase());
		if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }

		return new CustomUserDetails(user);
	}

}
