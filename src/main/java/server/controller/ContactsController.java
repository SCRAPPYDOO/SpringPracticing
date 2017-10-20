package server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.repository.contacts.Contact;
import server.service.ContactsService;

@RestController
public class ContactsController {
	
	@Autowired
	ContactsService contactsService;
	
	@RequestMapping(method=RequestMethod.POST, value="/contacts")
	public void addContact(Contact contact) {
		contactsService.addContact(contact);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/contacts")
	public void updateContact(Contact contact) {
		contactsService.updateContact(contact);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contacts")
	public void deleteContact(Contact contact) {
		contactsService.deleteContact(contact);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contacts/{owner}")
	public List<Contact> getContacts(int owner) {
		return contactsService.getContacts(owner);
	}
	
}
