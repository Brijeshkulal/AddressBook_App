package com.bridgelabz.addressbookapplication.services;

import java.util.List;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;
import com.bridgelabz.addressbookapplication.model.Contact;

public interface IAddressBookService {
	
	List<Contact> getContact();

	Contact getContactById(int contactId);
	
	Contact createContact(ContactDTO contactDTO);

	Contact updateContact(int contactId, ContactDTO contactDTO);

	void deleteContact(int contactId);

}
