package server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.dao.MessageDao;
import server.repository.conversation.Conversation;
import server.repository.messages.Message;

@Service
public class MessagesService {

	@Autowired
	private MessageDao messageDao;
	
	public Message addMessage(Message message) {
		return messageDao.addMessage(message);
	}

	public List<Message> getMessages(Conversation conversation) {
		return messageDao.getMessages(conversation);
	}

}
