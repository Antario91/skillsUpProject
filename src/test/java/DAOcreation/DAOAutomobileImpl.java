package DAOcreation;


public class DAOAutomobileImpl extends WorkingWithSession implements DAOAutomobile {

	public void addAutomobile(Object auto) {
		session.save(auto);

	}

	public void deleteAutomobile(Object auto) {
		session.delete(auto);

	}

	public Object getAutomobile(Object obj,int id) {
		Object loadedObject = session.load(obj.getClass(), id);
		return loadedObject;
	}

}
