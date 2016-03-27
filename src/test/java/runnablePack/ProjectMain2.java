package runnablePack;

import DAOcreation.WorkingWithSession;
import model.Automobile;

public class ProjectMain2 {

	public static void main(String[] args) {
		Automobile auto1 = new Automobile("Rapid", 77.0, 175.0, 195.0, 10.3, 5.4, 1635);
		Automobile auto2 = new Automobile("Octavia", 132.0, 280.0, 229.0, 7.4, 6.4, 1938);
		
		WorkingWithSession dao = new WorkingWithSession();
		dao.startingSession();
		
		dao.addPersistence(auto1);
		dao.addPersistence(auto2);
		System.out.println("Added");
		
		Automobile auto3 = (Automobile) dao.getPersistence(auto1, 1);
		
		dao.deletePersistence(auto3);
		
		dao.endingSession();
		System.out.println("Session is over");
		
		dao.closeSessionFactory();
		System.out.println("SessionFactory is over");
		

	}

}
