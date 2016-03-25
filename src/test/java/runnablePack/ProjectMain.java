package runnablePack;


import DAOcreation.DAOCarShowroomImpl;
import model.Address;
import model.CarShowroom;
import model.Owner;

public class ProjectMain {

	public static void main(String[] args) {
		Owner itsMe = new Owner("Alexandr", "Goloborodko");
		Owner itsYou = new Owner("Alyona", "Bulanova");
		
		Address adrs = new Address("Ukraine", "Dnepropetrovsk", "Savkina 6");
		Address adrs1 = new Address("Ukraine", "Dnepropetrovsk", "Surskoy 13");
		
		CarShowroom auto1 = new CarShowroom("SkodaAuto", itsMe, adrs);
		CarShowroom auto2 = new CarShowroom("SkodaAutomotive", itsYou, adrs1);
		
		DAOCarShowroomImpl dao = new DAOCarShowroomImpl();
		
		dao.startingSession();

		dao.addCarShowroom(auto1);
		dao.addCarShowroom(auto2);
		System.out.println("Added");

		adrs = null;
		CarShowroom gettedAuto = dao.getCarShowroom(2);
		adrs = gettedAuto.getAddress();
		System.out.println("Country is -> " + adrs.getCounty() + "\n" + 
						   "City is -> " + adrs.getCity() + "\n" + 
						   "Street is -> " + adrs.getStreet());
		
		System.out.println();
	
		itsMe = null;
		itsMe = gettedAuto.getOwner();
		System.out.println("Name is -> " + itsMe.getName() + "\n" + 
						   "Surname is -> " + itsMe.getSurname());

		dao.endingSession();
		System.out.println("Session is over");
		dao.closeSessionFactory();
		System.out.println("SessionFactory is over");

	}

}
