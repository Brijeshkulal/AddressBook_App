package com.bridgelabz.addressbookapplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;
import com.bridgelabz.addressbookapplication.model.Contact;

@Service
public class AddressBookService implements IAddressBookService{

	@Override
	public List<Contact> getContact() {
		List<Contact> contactList = new ArrayList<>();
		contactList.add(new Contact(1, new ContactDTO("Brijesh", "kulal", "jai-hind block", "Karnataka", "Mangaluru", "671323", "9876548910")));
		return contactList;
	}

	@Override
	public Contact getContactById(int contactId) {
		Contact contact = new Contact(1, new ContactDTO("Brijesh", "kulal", "jai-hind block", "Karnataka", "Mangaluru", "671323", "9876548910"));
		return contact;
	}

	@Override
	public Contact createContact(ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public Contact updateContact(int contactId, ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {
		// TODO Auto-generated method stub
	}

}
