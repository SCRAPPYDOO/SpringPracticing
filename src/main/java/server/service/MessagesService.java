package server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.dao.MessageDao;
import server.repository.messages.Message;

@Service
public class MessagesService {

	@Autowired
	private MessageDao messageDao;
	
	public Message addMessage(Message message) {
		return messageDao.addMessage(message);
	}

	public List<Message> getMessages(int fromWho, int toWhoom) {
		return messageDao.getMessages(fromWho, toWhoom);
	}

}
