package server.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.repository.messages.Message;
import server.repository.messages.MessagesRepository;

@Component
public class MessageDao {

	@Autowired
	private MessagesRepository messageRespository;
	
	public Message addMessage(Message message) {
		message.setDate(new Date());
		return messageRespository.save(message);
	}

	public List<Message> getMessages(int fromWho, int toWhoom) {
		return messageRespository.findByFromWhoAndToWhoom(fromWho, toWhoom);
	}

}
