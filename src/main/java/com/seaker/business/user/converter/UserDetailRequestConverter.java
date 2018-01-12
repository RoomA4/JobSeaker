package com.seaker.business.user.converter;

import java.util.UUID;

import com.seaker.business.bo.User;
import com.seaker.business.constant.Role;
import com.seaker.business.dto.UserDetailRequest;
import com.seaker.business.dto.UserDetailsResponse;

public class UserDetailRequestConverter {

	public static User converUserDetailsRequest(UserDetailRequest request) {

		User user = new User();
		user.setUserName(request.getUserName());
		user.setDateOfRegistration(request.getDateOfRegistration());
		user.setEmailAddress(request.getEmailAddress());
		user.setGender(request.getGender());
		user.setId(UUID.randomUUID().toString());
		user.setRole(Role.valueOf(request.getRole()));
		user.setSocialNetworkSignature(request.getSocialNetworkSignature());

		return user;
	}

	public static UserDetailsResponse convertUserDetailsToResponse(User user) {
		UserDetailsResponse response = new UserDetailsResponse();
		response.setUserName(user.getUserName());
		return response;
	}

}
