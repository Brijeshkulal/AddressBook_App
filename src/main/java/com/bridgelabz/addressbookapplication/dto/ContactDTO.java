package com.bridgelabz.addressbookapplication.dto;

public class ContactDTO {
	
	public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String zip;
    public String phone;
	
    @Override
	public String toString() {
		return "ContactDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
				+ state + ", city=" + city + ", zip=" + zip + ", phone=" + phone + "]";
	}

	public ContactDTO(String firstName, String lastName, String address, String state, String city, String zip,
			String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
	}

}
