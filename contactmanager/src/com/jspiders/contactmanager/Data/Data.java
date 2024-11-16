package com.jspiders.contactmanager.Data;

import com.jspiders.contactmanager.entity.Contact;

public interface Data {
	
	void addContact(Contact contact);
	
	void deleteContact(int id);
	
	Contact findContactById(int id);

	Contact[] findAllContacts();
	
}
