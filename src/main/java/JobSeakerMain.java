import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seaker.business.bo.Achievements;
import com.seaker.business.bo.Address;
import com.seaker.business.bo.Attachment;
import com.seaker.business.bo.Certifications;
import com.seaker.business.bo.Duration;
import com.seaker.business.bo.Education;
import com.seaker.business.bo.Employer;
import com.seaker.business.bo.Experience;
import com.seaker.business.bo.StateFullEntity;
import com.seaker.business.bo.User;
import com.seaker.business.bo.UserProfile;

public class JobSeakerMain {

	public static void main(String[] args) {

		SessionFactory factory  = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Date presentDate = new Date();
		
		
		//Test Employer
		/*Employer employer = new Employer();
		employer.setId(new StateFullEntity(UUID.randomUUID().toString()));
		employer.setName("prakash");
		employer.setEmailAddress("abc.gmai.com");
		
		User user = new User();
		user.setId(new StateFullEntity(UUID.randomUUID().toString()));
		Attachment attachment = new Attachment();
		attachment.setAttachmentName("Prakash Test");
		attachment.setUserId(employer.getId());
		
		employer.getAttachments().add(attachment);
		//Test User Details 
		//User user2 = new User();
		
		user.setDateOfRegistration(presentDate);
		user.setEmailAddress("priyank@gmail.com");
		user.setGender("MALE");
		user.setSocialNetworkSignature("profile/linkedIn");
		user.setUserName("priyankjoshi");
		user.setMobileNumber("992291012");*/
		
		//Saving the UserProfile details
		
		
		//Adding Experience
		/*Duration duration = new Duration();
		duration.setStartDate(new Date());
		duration.setEndDate(new Date());
		Experience professionalExp = new Experience();
		professionalExp.setCompanyName("SABA");
		professionalExp.setDuration(duration);
		professionalExp.setDesignation("SOFTWARE ENGINEER");
		professionalExp.setExperienceId(UUID.randomUUID().toString());
		professionalExp.setUserProfile(profile);
		
		profile.getExperiences().add(professionalExp);
		
		//Adding Education
		Education education = new Education();
		education.setDuration(duration);
		education.setName("HIGH SCHOOL");
		education.setEducationId(UUID.randomUUID().toString());
		education.setUserProfile(profile);
		
		profile.getEducation().add(education);
		
		//Adding Certification
		
		Certifications certifiation = new Certifications();
		certifiation.setCertificateName("OCJP");
		certifiation.setDuration(duration);
		certifiation.setCertificationId(UUID.randomUUID().toString());
		certifiation.setUserProfile(profile);
		certifiation.setCertificationAuthority("SUN-Certified");
		
		profile.getCertifications().add(certifiation);
		
		//Adding Achievements
		Achievements achievement = new Achievements();
		achievement.setAchievementName("Achuevement1");
		achievement.setDescription("JAVA");
		achievement.setUserProfile(profile);
		achievement.setAchievementId(UUID.randomUUID().toString());
		
		profile.getAchievements().add(achievement);*/
		
		
		/*Address add = new Address();
		add.setUserid(employer.getId());
		Address add2 = new Address();
		
		add2.setUserid(employer.getId());
		
		employer.getBranchLocaltion().add(add);
		employer.getBranchLocaltion().add(add2);*/
		
		session.beginTransaction();
		/*session.save(employer);
		session.save(user);*/
		/*session.getTransaction().commit();
		
		System.out.println(" User saved");
		
		
		session.close();
		
		session = factory.openSession();
		session.beginTransaction();*/
		
		UserProfile profile = new UserProfile();
		profile.setUserProfileId(UUID.randomUUID().toString());
		profile.setSummary("This is userProfile");
		
		
		User user = (User) session.get(User.class, new StateFullEntity("4404283d-70b4-4f7d-a3f0-39f036085b02"));
		
		profile.setUser(user);
		//session.saveOrUpdate(user);
		session.save(profile);
		
		/*session.save(professionalExp);
		session.save(education);
		session.save(certifiation);
		session.save(achievement);*/
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
		session = factory.openSession();
		session.beginTransaction();
		
		System.out.println("Fetching Data..");
		
		Employer emp = (Employer) session.get(Employer.class, new StateFullEntity("ca829681-9f4f-4f32-863e-5dd421c80d8c"));
		if (emp != null)
		{
			System.out.println(emp.getName());
			
			System.out.println("Address..."
					+ "");
			List<Address> addressList = emp.getBranchLocaltion();
			for (Address address : addressList) {
				System.out.println(address.getAddressId());
			}
		}
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
	
	}

}
