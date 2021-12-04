package com.example.demo;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class securitylayer extends WebSecurityConfigurerAdapter{
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	                .withUser("admin").password("{noop}boss").roles("ADMIN");

	    }
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http.httpBasic().and().authorizeRequests()
	                .antMatchers(HttpMethod.POST, "/search/**").hasRole("ADMIN")
	                .antMatchers(HttpMethod.GET, "/").hasRole("USER")
	                .and()
	                .csrf().disable()
	                .formLogin().disable();
	    }
}