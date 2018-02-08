package com.seaker.business.user.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		Date regDate = generateRegistrationDate(request.getDateOfRegistration());
		user.setDateOfRegistration(regDate);
		user.setEmailAddress(request.getEmailAddress());
		Gender gender = Gender.valueOf(request.getGender());
		user.setGender(gender);
		user.setId(UUID.randomUUID().toString());
		Role role = Role.valueOf(request.getRole());
		user.setRole(role);
		user.setSocialNetworkSignature(request.getsns());
		user.setMobileNumber(request.getMobileNumber());
		return user;
	}

	private static Date generateRegistrationDate(String dateOfRegistration) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		try {
			return dateFormat.parse(dateOfRegistration);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static UserDetailsResponse convertUserDetailsToResponse(User user) {
		UserDetailsResponse response = new UserDetailsResponse();
		response.setUserName(user.getUserName());
		return response;
	}

}
