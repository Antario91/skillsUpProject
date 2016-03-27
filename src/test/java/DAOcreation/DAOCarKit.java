package DAOcreation;

import model.CarKit;

public interface DAOCarKit {
	public void addCarKit(CarKit kit);
	public void deleteCarKit(CarKit kit);
	public CarKit getCarKit(int id);

}
