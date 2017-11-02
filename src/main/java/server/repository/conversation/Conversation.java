package server.repository.conversation;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import server.repository.messages.Message;

@Entity
public class Conversation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	public Conversation() {
		super();
	}

	public Conversation(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "conversation")
	List<Message> listOfMessages;

	public List<Message> getListOfMessages() {
		return listOfMessages;
	}

	public void setListOfMessages(List<Message> listOfMessages) {
		this.listOfMessages = listOfMessages;
	}
	
	/*@OneToMany(mappedBy = "conversation")
	List<Contact> contacts;*/
	
	
}
