import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seaker.business.bo.Employer;
import com.seaker.business.bo.User;
import com.seaker.business.bo.UserProfile;

public class JobSeakerMain {

	public static void main(String[] args) {

		SessionFactory factory  = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Date presentDate = new Date();
		
		
		//Test Employer
		Employer employer = new Employer();
		employer.setEmployerId("1");
		employer.setName("pjoshi");
		employer.setEmailAddress("abc.gmai.com");
		
		//Test User Details 
		User user = new User();
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		user.setDateOfRegistration(presentDate);
		user.setEmailAddress("priyank@gmail.com");
		user.setGender("MALE");
		user.setSocialNetworkSignature("profile/linkedIn");
		user.setUserName("priyankjoshi");
		user.setMobileNumber("992291012");
		
		//Saving the UserProfile details
		UserProfile profile = new UserProfile();
		String userProfileId  =  UUID.randomUUID().toString();
		profile.setUserProfileId(userProfileId);
		profile.setSummary("This is userProfile");
		profile.setUser(user);
		
		
		
		session.beginTransaction();
		session.save(employer);
		session.save(user);
		session.save(profile);
		session.getTransaction().commit();
		session.close();
		
	
	}

}
