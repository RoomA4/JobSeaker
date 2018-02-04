package com.seaker.business.user.converter;

import java.util.UUID;

import com.seaker.business.bo.User;
import com.seaker.business.bo.User.Gender;
import com.seaker.business.constant.Role;
import com.seaker.business.dto.UserDetailRequest;
import com.seaker.business.dto.UserDetailsResponse;

public class UserDetailRequestConverter {

	public static User converUserDetailsRequest(UserDetailRequest request) {

		User user = new User();
		user.setUserName(request.getUserName());
		user.setDateOfRegistration(request.getDateOfRegistration());
		user.setEmailAddress(request.getEmailAddress());
		Gender gender = Gender.valueOf(request.getGender());
		//user.setGender(gender);
		user.setId(UUID.randomUUID().toString());
		Role role = Role.valueOf(request.getRole());
		//user.setRole(role);
		user.setSocialNetworkSignature(request.getSocialNetworkSignature());

		return user;
	}

	public static UserDetailsResponse convertUserDetailsToResponse(User user) {
		UserDetailsResponse response = new UserDetailsResponse();
		response.setUserName(user.getUserName());
		return response;
	}

}
