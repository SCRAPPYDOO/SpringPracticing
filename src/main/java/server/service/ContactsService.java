package server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.dao.ContactsDao;
import server.repository.contacts.Contact;

@Service
public class ContactsService {

	@Autowired
	ContactsDao contactsDao;
	
	public void addContact(Contact contact) {
		contactsDao.addContact(contact);
		
	}

	public void updateContact(Contact contact) {
		contactsDao.updateContact(contact);
		
	}

	public void deleteContact(Contact contact) {
		contactsDao.deleteContact(contact);
		
	}
	
	public List<Contact> getContacts(int owner) {
		return contactsDao.getContacts(owner);
	}


}
