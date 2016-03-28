package model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`Auto Factory`")
public class AutoFactory {
//	@Id
//	@Column(name = "ID")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
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

	 @Override
	    public boolean equals(Object o) {
	        if ( this == o ) {
	            return true;
	        }
	        if ( o == null || getClass() != o.getClass() ) {
	            return false;
	        }
	        AutoFactory that = (AutoFactory) o;
	        return Objects.equals( auto, that.auto ) &&
	                Objects.equals( factory, that.factory );
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash( auto, factory );
	    }
	
}
