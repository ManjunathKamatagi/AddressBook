package com.maveric.entity;

import java.util.List;

public class Contact {
	
	String name;
	String organisation;
	List<PhoneNumber> phoneNumbers;
	List<Address> addresses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address>addresses) {
		this.addresses = addresses;
	}
}
