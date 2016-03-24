package runnablePack;


import DAOcreation.DAOCarShowroomImpl;
import model.CarShowroom;

public class ProjectMain {

	public static void main(String[] args) {
//		CarShowroom auto1 = new CarShowroom("SkodaAuto", "Alexandr Goloborodko", "Aeroportovskaya 17");
		CarShowroom auto2 = new CarShowroom("SkodaAuto2", "Alexandr Goloborodko2", "Aeroportovskaya 17_2");
		
		DAOCarShowroomImpl dao = new DAOCarShowroomImpl();
		
		dao.startingSession();
		CarShowroom newAuto = dao.getCarShowroom(7);
//		dao.deleteCarShowroom(newAuto);
//		System.out.println("Deleted");
		dao.addCarShowroom(auto2);
		System.out.println("Added");
//		System.out.println(newAuto.getId() + " " + newAuto.getName() + " " + newAuto.getOwner() + " " + newAuto.getAddress());
		dao.endingSession();
		System.out.println("Session is over");

	}

}
