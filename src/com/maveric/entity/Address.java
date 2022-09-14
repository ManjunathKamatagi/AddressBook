package com.maveric.entity;

public class Address {
	@Override
	public String toString() {
		// return "Address [label=" + label + ", address=" + address + "]";
		return getAddress();
	}

	String label;
	String address;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address(String label, String address) {
		super();
		this.label = label;
		this.address = address;
	}
}
