package com.maveric.entity;

public class PhoneNumber {
	String label;
	int phoneNumber;
	public PhoneNumber(String label, int phoneNumber) {
		super();
		this.label = label;
		this.phoneNumber = phoneNumber;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
