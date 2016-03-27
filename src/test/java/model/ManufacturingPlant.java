package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`Manufacturing plant`")
public class ManufacturingPlant {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Country")
	private String country;
	
	@OneToMany(mappedBy = "factory", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AutoFactory> autofactory = new ArrayList<AutoFactory>();
	
	public ManufacturingPlant(){
		
	}

	public ManufacturingPlant(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public List<AutoFactory> getAutoFactory(){
		return autofactory;
	}

	public int getId() {
		return id;
	}
	
	

}