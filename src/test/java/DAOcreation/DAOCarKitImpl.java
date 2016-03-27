package DAOcreation;

import model.CarKit;

public class DAOCarKitImpl extends WorkingWithSession implements DAOCarKit {

	public void addCarKit(CarKit kit) {
		session.save(kit);

	}

	public void deleteCarKit(CarKit kit) {
		session.delete(kit);

	}

	public CarKit getCarKit(int id) {
		CarKit loadedObject = session.load(CarKit.class, id);
		return loadedObject;
	}

}
