package com.bridgelabz.addressbookapplication.model;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;

public class Contact {
	private int contactId;
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String phone;
	
	
	
	public Contact(int contactId, ContactDTO contactDTO) {
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
	}
	
	public Contact() {
		
	}

	public int getContactId() {
		return contactId;
	}
	
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}
