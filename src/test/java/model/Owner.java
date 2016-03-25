package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Owner {
	@Column(name = "Owner_Name")
	private String name;
	
	@Column(name = "Owner_Surname")
	private String surname;

	
	//-----------------------------------Constructors
	public Owner(){
		
	}
	
	public Owner(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

		
	//-----------------------------------Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
