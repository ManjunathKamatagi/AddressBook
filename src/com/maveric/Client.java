package com.maveric;

import java.util.ArrayList;
import java.util.List;

import com.maveric.entity.Address;
import com.maveric.entity.AddressBook;
import com.maveric.entity.Contact;
import com.maveric.entity.PhoneNumber;

public class Client {
	public static void main(String[] args) {
		AddressBook b = new AddressBook();
		addContact(b, "Manju", "Maveric", "Bagalkot");
		addContact(b, "Vinayak", "XYZ", "Bengaluru");
		addContact(b, "Ram", "ABC", "Hyderabad");

		searchByName(b, "Ram");
		searchByOrganisation(b, "XYZ");
		updateContact(b);
		deleteContact(b);
	}

	static void addContact(AddressBook b, String name, String org, String city) {
		Contact c = new Contact();
		c.setName(name);
		c.setOrganisation(org);
		c.setAddresses(getAddress(name, city));
		c.setPhoneNumbers(getPhoneList());
		b.addContact(c);
		System.out.println("Added contact with following details");
		System.out.println("Name : " + c.getName());
		System.out.println("Org : " + c.getOrganisation());
		System.out.println("Phone numbers : " + c.getPhoneNumbers().get(0).getPhoneNumber());
		System.out.println("Address : " + c.getAddresses());
		System.out.println("---------------------------------------------");

	}

	static void searchByName(AddressBook b, String name) {
		List<Contact> contactList = b.searchByName(name);
		for (Contact c : contactList) {
			System.out.println("Search results for Contact with name : " + name);
			System.out.println("Name : " + c.getName());
			System.out.println("Org : " + c.getOrganisation());
			System.out.println("Phone numbers : " + c.getPhoneNumbers().get(0).getPhoneNumber());
			System.out.print("Addresses : ");
			c.getAddresses().forEach(e -> System.out.println( e.getLabel() + ", " + e.getAddress()));
			System.out.println("---------------------------------------------");
		}

		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
	}

	static void searchByOrganisation(AddressBook b, String org) {

		List<Contact> contactList = b.searchByOrganisation(org);
		for (Contact c : contactList) {
			System.out.println("Search results for Contact with Organisation :" + org);
			System.out.println("Name : " + c.getName());
			System.out.println("Org : " + c.getOrganisation());
			System.out.println("Phone numbers : " + c.getPhoneNumbers().get(0).getPhoneNumber());
			System.out.print("Addresses : ");
			c.getAddresses().forEach(e -> System.out.println(e.getLabel() + ", " + e.getAddress()));
			System.out.println("---------------------------------------------");
		}
	}

	static void updateContact(AddressBook b) {
		System.out.println(b.updateContact("ManjuNath", b.searchByName("Manju").get(0)));
		//System.out.println(b.updateContact("ManjuNath", 998800880));
		
	}

	static void deleteContact(AddressBook b) {
		System.out.println(b.deleteContact("ManjuNath"));
	}

	static List<PhoneNumber> getPhoneList() {
		List<PhoneNumber> l = new ArrayList<>();
		PhoneNumber p = new PhoneNumber("Manju", 998800880);
		l.add(p);
		return l;
	}

	static List<Address> getAddress(String name, String city) {
		List<Address> l = new ArrayList<>();
		Address a = new Address(name, city);
		l.add(a);
		return l;
	}
}
