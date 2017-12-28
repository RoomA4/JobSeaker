import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seaker.business.bo.Achievements;
import com.seaker.business.bo.Address;
import com.seaker.business.bo.Certifications;
import com.seaker.business.bo.Duration;
import com.seaker.business.bo.Education;
import com.seaker.business.bo.Employer;
import com.seaker.business.bo.Experience;
import com.seaker.business.bo.Jobs;
import com.seaker.business.bo.User;
import com.seaker.business.bo.UserProfile;
import com.seaker.business.constant.Role;
import com.seaker.business.constant.UserType;

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
		user.setRole(Role.JOBSEAKER);
		user.setUserType(UserType.Professional);
		user.setSocialNetworkSignature("profile/linkedIn");
		user.setUserName("priyankjoshi");
		user.setMobileNumber("992291012");
		
		//Saving the UserProfile details
		UserProfile profile = new UserProfile();
		String userProfileId  =  UUID.randomUUID().toString();
		profile.setUserProfileId(userProfileId);
		profile.setSummary("This is userProfile");
		profile.setUser(user);
		
		//Adding Experience
		Duration duration = new Duration();
		duration.setStartDate(new Date());
		duration.setEndDate(new Date());
		Experience professionalExp = new Experience();
		professionalExp.setCompanyName("SABA");
		professionalExp.setDuration(duration);
		professionalExp.setDesignation("SOFTWARE ENGINEER");
		professionalExp.setExperienceId(UUID.randomUUID().toString());
		professionalExp.setUserProfile(profile);
		
		//Adding Education
		Education education = new Education();
		education.setDuration(duration);
		education.setName("HIGH SCHOOL");
		education.setEducationId(UUID.randomUUID().toString());
		education.setUserProfile(profile);
		
		//Adding Certification
		
		Certifications certifiation = new Certifications();
		certifiation.setCertificateName("OCJP");
		certifiation.setDuration(duration);
		certifiation.setCertificationId(UUID.randomUUID().toString());
		certifiation.setUserProfile(profile);
		certifiation.setCertificationAuthority("SUN-Certified");
		
		//Adding Achievements
		Achievements achievement = new Achievements();
		achievement.setAchievementName("Achuevement1");
		achievement.setDescription("JAVA");
		achievement.setUserProfile(profile);
		achievement.setAchievementId(UUID.randomUUID().toString());
		
		//Create new Job positing
		
		Jobs job = new Jobs();
		job.setId(UUID.randomUUID().toString());
		job.setAddress(new Address());
		job.setDescription("This is the description");
		job.setExperience("3");
		
		session.beginTransaction();
		//session.save(employer);
		session.save(user);
		session.save(job);
		/*session.save(profile);
		session.save(professionalExp);
		session.save(education);
		session.save(certifiation);
		session.save(achievement);*/
		session.getTransaction().commit();
		session.close();
		
	
	}

}
