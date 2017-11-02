package server.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.repository.contacts.Contact;
import server.repository.contacts.ContactsRepository;

@Component
public class ContactsDao {

	@Autowired
	ContactsRepository contactsRepository;
	
	public void addContact(Contact contact) {
		contactsRepository.save(contact);
	}

	public void updateContact(Contact contact) {
		contactsRepository.save(contact);
	}

	public void deleteContact(Contact contact) {
		contactsRepository.delete(contact);
	}
}
