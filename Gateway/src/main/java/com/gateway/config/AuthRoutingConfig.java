package com.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class AuthRoutingConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		.antMatchers("/woo/admin/**").access("#oauth2.hasScope('admin')")
		.antMatchers("/woo/board/**").access("#oauth2.hasScope('board')")
		.antMatchers("/woo/job/**").access("#oauth2.hasScope('job')")
		//.antMatchers("/woo/**").access("#oauth2.hasScope('admin') and #oauth2.hasScope('board') and #oauth2.hasScope('job')")
	//	.antMatchers("/woo/login").anonymous()
		.antMatchers("/woo/").anonymous()
		.antMatchers("/css/**").anonymous()
		.antMatchers("/js/**").anonymous()
			
		.anyRequest().authenticated();
	//	super.configure(http);
	}
}
