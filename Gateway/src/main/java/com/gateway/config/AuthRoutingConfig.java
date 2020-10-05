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
		.antMatchers("/api/admin/**").access("#oauth2.hasScope('admin')")
		.antMatchers("/api/board/**").access("#oauth2.hasScope('board')")
		.antMatchers("/api/job/**").access("#oauth2.hasScope('job')")
		//.antMatchers("/woo/**").access("#oauth2.hasScope('admin') and #oauth2.hasScope('board') and #oauth2.hasScope('job')")
		.antMatchers("/woo/login").anonymous()
		.anyRequest().authenticated();
	//	super.configure(http);
	}
}
