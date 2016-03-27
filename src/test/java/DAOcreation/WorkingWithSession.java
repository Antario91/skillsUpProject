package DAOcreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import buildSessionFactory.HibernateUtil;

public class WorkingWithSession {
	protected Session session;
	private SessionFactory sessionFactory;
	
	//-----------------------------------Session's methods
	public void startingSession(){
		sessionFactory = HibernateUtil.getFactory();
		System.out.println("DAOimpl is created!");
		session = sessionFactory.openSession();
		session.getTransaction().begin();
	}
	
	public void endingSession(){
		session.getTransaction().commit();
		session.close();
	}
	
	public void commitToDB(){
		session.getTransaction().commit();
	}
	
	public void closeSessionFactory(){
		sessionFactory.close();
	}
	
	//-----------------------------------DAO's methods
	public void addPersistence(Object obj) {
		session.save(obj);

	}

	public void deletePersistence(Object obj) {
		session.delete(obj);

	}

	public Object getPersistence(Object obj,int id) {
		Object loadedObject = session.load(obj.getClass(), id);
		return loadedObject;
	}

}
