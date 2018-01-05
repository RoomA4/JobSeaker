package com.seaker.business.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seaker.business.constant.UserURLs;
import com.seaker.business.dto.UserDetailRequest;
import com.seaker.business.dto.UserDetailsResponse;

@RestController
public class UserRegistrationController {

	@RequestMapping(value = UserURLs.REGISTER_USER , method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public UserDetailsResponse registerUser(@RequestBody UserDetailRequest userDetailRequest){
		String userName =userDetailRequest.getUserName();
		System.out.println(userName);
		
		UserDetailsResponse response = new UserDetailsResponse();
		response.setUserName(userName);
		return response;
	}
}
