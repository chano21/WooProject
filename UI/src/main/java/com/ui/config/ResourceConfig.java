package com.ui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
@Configuration
public class ResourceConfig extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        http.authorizeRequests()
        //.antMatchers("/").access("#oauth2.hasScope('admin')")
       // .antMatchers("/").access("#oauth2.hasScope('admin') and #oauth2.hasScope('board') and #oauth2.hasScope('job')")
        
//        .antMatchers("/css/**").permitAll()
//        .antMatchers("/js/**").permitAll()
//        .antMatchers("/login").permitAll()
//        .antMatchers("/**").access("#oauth2.hasScope('admin') and #oauth2.hasScope('board') and #oauth2.hasScope('job')")

    	.antMatchers("/**").permitAll();
        
 //       .anyRequest().authenticated();
    }
}