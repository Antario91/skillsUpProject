package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`Car kit`")
public class CarKit {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "`Window tinting`")
	private boolean windowTinting;
	
	@Column(name = "`Alloy wheels`")
	private boolean alloyWheels;
	
	@Column(name = "Immobiliser")
	private boolean immobiliser;
	
	@Column(name = "`Radio equipment`")
	private boolean radioEquipment;
	
	@Column(name = "`Ñruise ñontrol`")
	private boolean cruiseControl;
	
	@ManyToOne
	private Automobile auto;
	
	//-----------------------------------Constructors
	public CarKit(){
		
	}

	public CarKit(boolean windowTinting, boolean alloyWheels, boolean immobiliser, boolean radioEquipment,
			boolean cruiseControl) {
		this.windowTinting = windowTinting;
		this.alloyWheels = alloyWheels;
		this.immobiliser = immobiliser;
		this.radioEquipment = radioEquipment;
		this.cruiseControl = cruiseControl;
	}
	
	//-----------------------------------Getters and Setters
	public boolean isWindowTinting() {
		return windowTinting;
	}

	public void setWindowTinting(boolean windowTinting) {
		this.windowTinting = windowTinting;
	}

	public boolean isAlloyWheels() {
		return alloyWheels;
	}

	public void setAlloyWheels(boolean alloyWheels) {
		this.alloyWheels = alloyWheels;
	}

	public boolean isImmobiliser() {
		return immobiliser;
	}

	public void setImmobiliser(boolean immobiliser) {
		this.immobiliser = immobiliser;
	}

	public boolean isRadioEquipment() {
		return radioEquipment;
	}

	public void setRadioEquipment(boolean radioEquipment) {
		this.radioEquipment = radioEquipment;
	}

	public boolean isCruiseControl() {
		return cruiseControl;
	}

	public void setCruiseControl(boolean cruiseControl) {
		this.cruiseControl = cruiseControl;
	}
	
	public Automobile getAutomobile(){
		return auto;
	}
	
	public void setAutomobile(Automobile auto){
		this.auto = auto;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString(){
		return "Window tinting -> " + isWindowTinting() + "\n" +
				"Alloy wheels -> " + isAlloyWheels() + "\n" +
				"Immobiliser -> " + isImmobiliser() + "\n" +
				"Radio equipment -> " + isRadioEquipment() + "\n" +
				"Cruise control -> " + isCruiseControl();
	}
	

}
