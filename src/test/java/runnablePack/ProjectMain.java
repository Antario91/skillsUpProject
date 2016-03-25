package runnablePack;


import DAOcreation.DAOCarShowroomImpl;
import model.Address;
import model.CarShowroom;

public class ProjectMain {

	public static void main(String[] args) {
		Address adrs = new Address("Ukraine", "Dnepropetrovsk", "Savkina 6");
		CarShowroom auto2 = new CarShowroom("SkodaAuto", "Alexandr Goloborodko", adrs);
		
		DAOCarShowroomImpl dao = new DAOCarShowroomImpl();
		
		dao.startingSession();
//		CarShowroom newAuto = dao.getCarShowroom(7);
//		dao.deleteCarShowroom(newAuto);
//		System.out.println("Deleted");
		dao.addCarShowroom(auto2);
		System.out.println("Added");
//		System.out.println(newAuto.getId() + " " + newAuto.getName() + " " + newAuto.getOwner() + " " + newAuto.getAddress());
		dao.endingSession();
		System.out.println("Session is over");
		dao.closeSessionFactory();
		System.out.println("SessionFactory is over");

	}

}
