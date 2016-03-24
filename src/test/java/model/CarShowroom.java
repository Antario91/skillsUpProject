package model;

import javax.persistence.Column;
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
	
	@Column(name = "Name")
	String name;
	
	@Column(name = "Owner")
	String owner;
	
	@Column(name = "Address")
	String address;
	
	
	//-----------------------------------Constructors
	public CarShowroom(){
		
	}
	
	public CarShowroom(String name, String owner, String address) {
		this.name = name;
		this.owner = owner;
		this.address = address;
	}

	//-----------------------------------Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
