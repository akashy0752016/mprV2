package com.ddugky.mprmis.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Bean
	public UserDetailsService customUserDetailsService() {
		return new CustomUserDetailsService();
	}
	
	@Bean
	public DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(customUserDetailsService());
		authProvider.setPasswordEncoder(new CustomPasswordEncoder());
		return authProvider;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(authProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
			.antMatchers("/","/login").permitAll()
			.antMatchers("/resources/**").permitAll()
	        .anyRequest().authenticated()
	        .and()
	        .formLogin()
	        .successHandler(customAuthenticationSuccessHandler())
	        .loginPage("/login")
	        .failureUrl("/login?error")
	        .usernameParameter("username")
	        .passwordParameter("password")
	        .loginProcessingUrl("/processLogin")
	        //.defaultSuccessUrl("/dashboard", true)
	        .and()
	        .logout()
	        .logoutUrl("/logoutProcessUrl")
	        .logoutSuccessUrl("/login?logout")
	        .and()
	    	.exceptionHandling().accessDeniedPage("/login?error")
	    	.and().httpBasic();
	}
	
	@Bean
    public AuthenticationSuccessHandler customAuthenticationSuccessHandler(){
        return new CustomAuthenticationSuccessHandler();
    }
}
