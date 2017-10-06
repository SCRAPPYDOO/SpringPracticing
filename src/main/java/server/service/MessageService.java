package server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.dao.MessageDao;
import server.repository.message.Message;

@Component
public class MessageService {

	@Autowired
	MessageDao messageDao;
	
	public Message sendMessage(int fromWho, int toWhoom, String message) {
		return messageDao.sendMessage(fromWho, toWhoom, message);
	}

	public List<Message> getMessages(int fromWho, int toWhoom) {
		return messageDao.getMessages(fromWho, toWhoom);
	}

}
