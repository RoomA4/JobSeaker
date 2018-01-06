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
		employer.setName("afkajb");
		employer.setEmailAddress("abc.gmai.com");
		
		Attachment attachment = new Attachment();
		attachment.setAttachmentName("A Test");
		attachment.setId(employer);
		Attachment attachment2 = new Attachment();
		attachment2.setAttachmentName("B Test");
		attachment2.setId(employer);

		employer.getAttachments().add(attachment);
		employer.getAttachments().add(attachment2);

		
		
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setUserName("Prkaahs");
		
		Attachment attachment3 = new Attachment();
		attachment3.setAttachmentName("kak Test");
		attachment3.setId(user);
		Attachment attachment4 = new Attachment();
		attachment4.setAttachmentName("fk Test");
		attachment4.setId(user);
		
		user.getAttachments().add(attachment3);
		user.getAttachments().add(attachment4);
		
		session.save(user);
		session.save(employer);		
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	
	}

}
