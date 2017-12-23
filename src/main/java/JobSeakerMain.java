import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seaker.business.bo.Employer;
import com.seaker.business.bo.User;

public class JobSeakerMain {

	public static void main(String[] args) {

		SessionFactory factory  = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		
		Employer employer = new Employer();
		employer.setEmployerId("1");
		employer.setName("pjoshi");
		employer.setEmailAddress("abc.gmai.com");
		
		session.beginTransaction();
		session.save(employer);
		session.getTransaction().commit();
		session.close();
		
	
	}

}
