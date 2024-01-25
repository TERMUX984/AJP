package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		person p1 = new person(23, "Ravi", "VIGNAN", 35);
		person p2 = new person(34, "Kishore", "VIGNAN", 28);
		person p4 = new person(173, "Vinay", "VIGNAN", 29);
		
		employee e1 = new employee(1172,"Vinay","20k");
		employee e2 = new employee(194,"Dinesh","50k");
		
		bank b1 = new bank(173,"saptagiri","Vignan");
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(p1);
		session.persist(p2);
		session.persist(p4);
		
		session.persist(e1);
		session.persist(e2);
		
		session.persist(b1);
		
		tx.commit();

		factory.close();
	}

}
