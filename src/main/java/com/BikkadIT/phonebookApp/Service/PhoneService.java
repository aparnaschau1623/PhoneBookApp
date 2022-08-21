package com.BikkadIT.phonebookApp.Service;

import java.util.List;

import com.BikkadIT.phonebookApp.model.Contact;

public interface PhoneService {

	public boolean saveContact(Contact contact);

	List<Contact> getAllContact();
	
	public Contact getContactById(Integer contactId);
	
	public boolean deleteContactById(Integer contactId);
	
	
}
