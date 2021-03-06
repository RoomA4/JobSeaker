package com.seaker.business.authentication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seaker.business.bo.User;
import com.seaker.business.constant.Role;
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
		return new org.springframework.security.core.userdetails.User(user.getId(),user.getPassword(),
				user.getState().equals("ACTIVE"),true,true,true,getGrantedAuthorities(user));
		
	}

	public List<GrantedAuthority> getGrantedAuthorities(User user){
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		Role role = user.getRole();
		authorities.add(new SimpleGrantedAuthority(role.toString()));
	
		return authorities;
	}
	
}
