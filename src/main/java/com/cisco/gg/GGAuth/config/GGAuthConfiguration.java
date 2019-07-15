package com.cisco.gg.GGAuth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.cisco.collab.auth.filter.AuthFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;


@EnableWebSecurity
@Configuration
public class GGAuthConfiguration extends WebSecurityConfigurerAdapter{


    AuthFilter auth=new AuthFilter();
    @Override
    protected void configure(HttpSecurity httpSecurity)
    {
        httpSecurity.addFilterBefore(auth, BasicAuthenticationFilter.class);
    }


}
