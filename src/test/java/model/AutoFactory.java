package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AutoFactory {
	@Id
    @ManyToOne
	private Automobile auto;
	
	@Id
    @ManyToOne
	private ManufacturingPlant factory;
	
	//-----------------------------------Constructors
	public AutoFactory(){
		
	}

	public AutoFactory(Automobile auto, ManufacturingPlant factory) {
		this.auto = auto;
		this.factory = factory;
	}

	//-----------------------------------Getters and Setters
	public Automobile getAuto() {
		return auto;
	}

	public void setAuto(Automobile auto) {
		this.auto = auto;
	}

	public ManufacturingPlant getFactory() {
		return factory;
	}

	public void setFactory(ManufacturingPlant factory) {
		this.factory = factory;
	}

	
	
}
