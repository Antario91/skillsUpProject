package runnablePack;

import DAOcreation.DAOimpl;
import model.CarShowroom;

public class ProjectMain {

	public static void main(String[] args) {
		CarShowroom auto = new CarShowroom("SkodaAuto", "Alexandr Goloborodko", "Aeroportovskaya 17");
		auto.setId(1);
		System.out.println(auto.getName() + " " + auto.getOwner() + " " + auto.getAddress());
		DAOimpl dao = new DAOimpl();
		dao.addCarShowroom(auto);

	}

}
