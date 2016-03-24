package DAOcreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import buildSessionFactory.HibernateUtil;
import model.CarShowroom;

public class DAOimpl implements DAO {
	static SessionFactory sessionFactory;
	
	static{
		sessionFactory = HibernateUtil.getFactory();
		System.out.println("DAOimpl is created!");
	}

	public void addCarShowroom(CarShowroom obj) {
		Session session = sessionFactory.openSession();
		System.out.println("Session is open");
		session.getTransaction().begin();
		System.out.println("Transaction begin");
		session.save(obj);
		System.out.println("Object was persisted");
		session.getTransaction().commit();
		System.out.println("Transaction was commited");
		session.close();
		System.out.println("Session was closed");

	}

//	public void deleteCarShowroom(CarShowroom obj) {
//		
//		
//	}

}
