package model;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Automobile")
public class Automobile {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Model")
	private String model;
	
	@Column(name = "`Max Power(kW)`")
	private double maxPower;
	
	@Column(name = "`Max Torque(Nm)`")
	private double maxTorque;
	
	@Column(name = "`Max Speed(km/h)`")
	private double maxSpeed;
	
	@Column(name = "`Acceleration 0-100 km/h (s)`")
	private double acceleration;
	
	@Column(name = "`Fuel consumption(l/100 km)`")
	private double fuelConsumption;
	
	@Column(name = "`Weight(kg)`")
	private double weight;
	
	@OneToMany(mappedBy = "auto", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<CarKit> kit;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="auto")
	private Set<ManufacturingPlant> factories;
	
	
//	@OneToMany(mappedBy = "auto", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<AutoFactory> autofactory = new ArrayList<AutoFactory>();
	

	//-----------------------------------Constructors
	public Automobile(){
		
	}

	public Automobile(String model, double maxPower, double maxTorque, double maxSpeed, double acceleration,
			double fuelConsumption, double weight) {
		this.model = model;
		this.maxPower = maxPower;
		this.maxTorque = maxTorque;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.fuelConsumption = fuelConsumption;
		this.weight = weight;
	}

	//-----------------------------------Getters and Setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(double maxPower) {
		this.maxPower = maxPower;
	}

	public double getMaxTorque() {
		return maxTorque;
	}

	public void setMaxTorque(double maxTorque) {
		this.maxTorque = maxTorque;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Set<CarKit> getCarKit(){
		return kit;
	}
	
	public void setCarKit(Set<CarKit> kit){
		this.kit = kit;
	}
	
	public Set<ManufacturingPlant> getFactories() {
		return factories;
	}

	public void setFactories(Set<ManufacturingPlant> factories) {
		this.factories = factories;
	}
	
//    public void addManufacturingPlant(ManufacturingPlant factory) {
//    	AutoFactory temp = new AutoFactory(this, factory);
//    	autofactory.add(temp);
//    	factory.getAutoFactory().add(temp);
//    }
//    
//    public void removeManufacturingPlant(ManufacturingPlant factory) {
//    	AutoFactory temp = new AutoFactory(this, factory);
//    	factory.getAutoFactory().remove(temp);
//    	autofactory.remove(temp);
//        temp.setAuto(null);
//        temp.setFactory(null);
//    }

	public int getId() {
		return id;
	}
	
	@Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        Automobile auto = (Automobile) o;
        return Objects.equals( id, auto.id );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }
	
	@Override
	public String toString(){
		return "Model is -> " + getModel() + "\n" +
				"Max power(kW) = " + getMaxPower() + "\n" +
				"Max torque(Nm) = " + getMaxTorque() + "\n" +
				"Max speed(km/h) = " + getMaxSpeed() +  "\n" +
				"Acceleration 0-100 km/h (s) = "+ getAcceleration() + "\n" + 
				"Fuel consumption(l/100 km) = " + getFuelConsumption() +  "\n" +
				"Weight(kg) = " + getWeight();
	}
	
}
