package com.seaker.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seaker.business.bo.User;
import com.seaker.business.constant.UserURLs;
import com.seaker.business.dto.UserDetailRequest;
import com.seaker.business.dto.UserDetailsResponse;
import com.seaker.business.exception.UserException;
import com.seaker.business.service.UserService;
import com.seaker.business.user.converter.UserDetailRequestConverter;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = UserURLs.REGISTER_USER , method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public UserDetailsResponse registerUser(@RequestBody UserDetailRequest userDetailRequest){
		
		User user =	UserDetailRequestConverter.converUserDetailsRequest(userDetailRequest); 
			try {
				userService.registerUser(user);
				
			} catch (UserException e) {
				e.printStackTrace();
			}
			return UserDetailRequestConverter.convertUserDetailsToResponse(user);
	}
}
