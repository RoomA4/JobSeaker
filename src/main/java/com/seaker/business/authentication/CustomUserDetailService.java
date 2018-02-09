package com.seaker.business.authentication;

import java.util.logging.Logger;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seaker.business.bo.User;
import com.seaker.business.service.UserService;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserService userService;
	
	

	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
		
		User user = userService.findBySsoId(ssoId);
		if(user== null){
			throw new UsernameNotFoundException("User ID not found");
		}
		//return new org.springframework.security.core.userdetails.User(user.getId(),, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities)
		
	}

	
}
