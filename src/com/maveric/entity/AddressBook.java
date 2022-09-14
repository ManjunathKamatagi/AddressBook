package com.maveric.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	List<Contact> contacts ;
	
	
	public AddressBook() {
		contacts = new ArrayList<>();
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public List<Contact> searchByName(String name) {
		List<Contact> contactList = new ArrayList<>();
		for(Contact c : contacts) {
			if(c.getName().equals(name)) {
				contactList.add(c);
			}
		}
		return contactList;
	}
	
	public List<Contact> searchByOrganisation(String org) {
		List<Contact> contactList = new ArrayList<>();
		for(Contact c : contacts) {
			if(c.getOrganisation().equals(org)) {
				contactList. add(c);
			}
		}
		return contactList;
	}
	
	public String updateContact(String name,Contact contact) {
		for(Contact c : contacts) {
			if(c.getName().equals(contact.getName())) {
				contact.setName(name);
				contacts.add(contact);
				break;
			}
			
		}
		
		deleteContact(name);
		
		return "updated successfully";
	}
	
	public String deleteContact(String name) {
		for(Contact c : contacts) {
			if(c.getName().equals(name)) {
				contacts.remove(c);
				return "Successfully deleted the contact";
			}
		}
		return "Could not delete, no such contact found";
	}
	
	
}
