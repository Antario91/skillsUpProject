package DAOcreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import buildSessionFactory.HibernateUtil;
import model.CarShowroom;

public class DAOCarShowroomImpl implements DAOCarShowroom {
	private Session session;
	private SessionFactory sessionFactory;
	
	//--------------methods
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

	public void addCarShowroom(CarShowroom obj) {
		session.save(obj);
		
	}

	public void deleteCarShowroom(CarShowroom obj) {
		session.delete(obj);
	}

	public CarShowroom getCarShowroom(int id) {
			CarShowroom loadedObject = session.load(CarShowroom.class, id);
			return loadedObject;
		
	}
		
}


