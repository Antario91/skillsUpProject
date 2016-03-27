package runnablePack;

import model.Automobile;
import model.CarKit;
import model.ManufacturingPlant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import DAOcreation.WorkingWithSession;


public class ProjectMain3 {

	public static void main(String[] args) {
		CarKit kit1 = new CarKit(true, false, true, false, true);
		CarKit kit2 = new CarKit(false, false, false, false, false);
		CarKit kit3 = new CarKit(true, true, true, true, true);
		CarKit kit4 = new CarKit(false, true, true, true, false);
		
		Automobile auto1 = new Automobile("Rapid", 77.0, 175.0, 195.0, 10.3, 5.4, 1635);
		Automobile auto2 = new Automobile("Octavia", 132.0, 280.0, 229.0, 7.4, 6.4, 1938);
		Automobile auto3 = new Automobile("Fabia", 81.0, 175.0, 196.0, 9.4, 4.8, 1609);		
		
		Set<CarKit> setKit1 = new HashSet<CarKit>();
		setKit1.add(kit1);
		setKit1.add(kit2);
		
		
		Set<CarKit> setKit2 = new HashSet<CarKit>();
		setKit2.add(kit3);
		
		Set<CarKit> setKit3 = new HashSet<CarKit>();
		setKit3.add(kit4);
		
		kit1.setAutomobile(auto1);
		kit2.setAutomobile(auto1);
		kit3.setAutomobile(auto2);
		kit4.setAutomobile(auto3);
		
		auto1.setCarKit(setKit1);
		auto2.setCarKit(setKit2);
		auto3.setCarKit(setKit3);
		
		ManufacturingPlant factory1 = new ManufacturingPlant("Ukraine");
		ManufacturingPlant factory2 = new ManufacturingPlant("`Czech Republic`");
		
		System.out.println("До создания Session");
		
		WorkingWithSession dao = new WorkingWithSession();
		
		dao.startingSession();
		System.out.println("Session started");
		
		dao.addPersistence(auto1);
		dao.addPersistence(auto2);
		dao.addPersistence(auto3);
		dao.addPersistence(factory1);
		dao.addPersistence(factory2);
		System.out.println("Added");
		
		
		
//		dao.deletePersistence(auto1);
//		Automobile auto3_1 = (Automobile) dao.getPersistence(auto1, 1);
//		
//		System.out.println("\n"+ auto3_1 + "\n");
		
		
//		setKit2.remove(kit3);
		
		
//		Set<CarKit> kitOfAuto1 = auto3_1.getCarKit();
//		
//		Iterator<CarKit> itr = kitOfAuto1.iterator();
//		System.out.println("size of kitOfAuto1 = " + kitOfAuto1.size());
//		
//		while(itr.hasNext()){
//			CarKit sample = itr.next();
//			System.out.println(sample);
//			System.out.println();
//		}
		
		
		dao.endingSession();
		System.out.println("Session is over");
		
		dao.closeSessionFactory();
		System.out.println("SessionFactory is over");
		
	}

}
