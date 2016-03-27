package DAOcreation;

import model.CarShowroom;

public class DAOCarShowroomImpl extends WorkingWithSession implements DAOCarShowroom {
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


