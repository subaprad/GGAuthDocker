package com.cisco.gg.GGAuth.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/auth")
public class CITokenController {
	

	@GetMapping("/isValid")
	public Boolean getStringObhect(@RequestParam String accesToken)
	{
		return true;
	}

	@GetMapping("/example")
	public String getStringObhect()
	{
		return "This is spring-boot with docker";
	}
	
	@GetMapping("/login")
	public Boolean login(@AuthenticationPrincipal final UserDetails userdetails)
	{
		String user=userdetails.getUsername();
		Collection<? extends GrantedAuthority> authUser=userdetails.getAuthorities();
		System.out.println("++++++++++++++"+user);
		return true;
	}

}
