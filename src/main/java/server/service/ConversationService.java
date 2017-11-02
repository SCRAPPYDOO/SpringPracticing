package server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.repository.contacts.Contact;
import server.repository.conversation.Conversation;
import server.repository.conversation.ConversationRepository;

@Service
public class ConversationService {
	
	@Autowired
	private ConversationRepository conversationRepository;
	
	public Conversation getConversation(int id) {
		return conversationRepository.getById(id);
	}

	public Conversation addConversation(Conversation conversation) {
		Conversation temp = conversationRepository.save(conversation);
		return conversation;
	}
}
