package server.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.repository.message.Message;
import server.repository.message.MessageRepository;

@Component
public class MessageDao {

	@Autowired
	MessageRepository messageRespository;
	
	public Message sendMessage(int fromWho, int toWhoom, String message) {
		Message messageObj = new Message(fromWho, toWhoom, message, new Date());
		return messageRespository.save(messageObj);
	}

	public List<Message> getMessages(int fromWho, int toWhoom) {
		return messageRespository.findByFromAndTo(fromWho, toWhoom);
	}

}
