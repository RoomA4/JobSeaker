import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seaker.business.bo.Attachment;
import com.seaker.business.bo.Employer;
import com.seaker.business.bo.User;

public class JobSeakerMain {

	public static void main(String[] args) {

		SessionFactory factory  = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		//Test Employer
		Employer employer = new Employer();
		employer.setId(UUID.randomUUID().toString());;
		employer.setName("prakash");
		employer.setEmailAddress("abc.gmai.com");
		
		Attachment attachment = new Attachment();
		attachment.setAttachmentName("Prakash Test");
		Attachment attachment2 = new Attachment();
		attachment2.setAttachmentName("Prakash Test");

		employer.getAttachments().add(attachment);
		employer.getAttachments().add(attachment2);

		session.saveOrUpdate(employer);		
		
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		
		Attachment attachment3 = new Attachment();
		attachment.setAttachmentName("Prakash Test");
		Attachment attachment4 = new Attachment();
		attachment2.setAttachmentName("Prakash Test");
		
		user.getAttachments().add(attachment3);
		user.getAttachments().add(attachment4);
		
		session.saveOrUpdate(user);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	
	}

}
