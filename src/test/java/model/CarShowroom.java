package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car_Showroom")
public class CarShowroom {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Title")
	private String name;
	
	@Embedded
	private Owner owner;
	
	@Embedded
	private Address address;
	
	
	//-----------------------------------Constructors
	public CarShowroom(){
		
	}
	
	public CarShowroom(String name, Owner owner, Address address) {
		this.name = name;
		this.owner = owner;
		this.address = address;
	}

	//-----------------------------------Getters and Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
