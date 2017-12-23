import java.util.Date;

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
		user.setDateOfRegistration(presentDate);
		user.setEmailAddress("priyank@gmail.com");
		user.setGender("MALE");
		user.setSocialNetworkSignature("profile/linkedIn");
		user.setUserName("priyankjoshi");
		user.setMobileNumber("992291012");
		
		//Saving the UserProfile details
		//UserProfile profile = new UserProfile();
		
		
		
		
		session.beginTransaction();
		session.save(employer);
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	
	}

}
